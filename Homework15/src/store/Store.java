package store;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import product.Fruit;
import product.IProductKind;
import product.Meat;
import product.ProductKindException;
import product.Vegetable;
import warehouse.IWarehouse;

public class Store implements IStore {
	private static final int SLEEP_TIME = 1_500;
	private static final int MIN_AMMOUNT = 5;
	private static final int DEFAULT_PRICE = 50;
	private static final int BASE_MONETARY_FUND = 1_000;
	private static String[][] names = { { "Banana", "Orange", "Apple" }, { "Potato", "Eggplant", "Cucumber" },
			{ "Pork", "Beef", "Chicken" } };
	private double monetaryFund;
	private IWarehouse supplier;
	private Map<String, IProductKind> dataBase;

	public Store(IWarehouse supplier) throws ProductKindException, StoreException {
		this.monetaryFund = BASE_MONETARY_FUND;
		dataBase = new ConcurrentHashMap<String, IProductKind>();
		
		if( supplier != null){
			this.supplier = supplier;
		}
		else{
			throw new StoreException("Bad supplier ");
		}

		for (int product = 0; product < names[0].length; product++) {
			String currentName = names[0][product];
			dataBase.put(currentName, new Fruit(DEFAULT_PRICE, currentName, MIN_AMMOUNT));
		}
		for (int product = 0; product < names[1].length; product++) {
			String currentName = names[1][product];
			dataBase.put(currentName, new Vegetable(DEFAULT_PRICE, currentName, MIN_AMMOUNT));
		}
		for (int product = 0; product < names[2].length; product++) {
			String currentName = names[2][product];
			dataBase.put(currentName, new Meat(DEFAULT_PRICE, currentName, MIN_AMMOUNT));
		}
	}

	public void loadProducts(IWarehouse supplier) throws StoreException {
		if (supplier != null) {
			dataBase.forEach((name, product) -> {
				if (product.getAmmount() <= MIN_AMMOUNT) {
					try {
						System.out.println( this + " is stocking on " + product);
						product.increaseAmmount(supplier.takeProduct(name));
						System.out.println("After stock: " + product + "\n");
						Thread.sleep(SLEEP_TIME);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		} else {
			throw new StoreException("Invalid loading parameters /n" + "You tried: kind : " + " " + supplier);
		}

	}

	@Override
	public void sellInstrument(String productName, int quantity) throws StoreException {
		if (productName != null && !productName.equals("")) {
			if (dataBase.containsKey(productName)) {
				IProductKind toSell = dataBase.get(productName);
				if (toSell.getAmmount() >= quantity) {
					System.out.println("Congratulations! You just bought "
				+ quantity + " number from " + toSell + "\n");
					try {
						toSell.reduceAmmount(quantity);
					} catch (ProductKindException e) {
						e.printStackTrace();
					}
					this.monetaryFund += toSell.getPrice() * quantity;
					return;
				}
				System.out.println("Sorry, our quantity is low, we have: "
				+ toSell + " you want: " + quantity +"\n");
				try {
					Thread.sleep(SLEEP_TIME);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println( this + " is starting to stock products \n");
				this.loadProducts(supplier);
			} else {
				System.out.println("Sorry, no such product");
			}
		} else {
			throw new StoreException("Invalid selling parameters");
		}
	}

}
