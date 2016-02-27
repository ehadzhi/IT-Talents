package warehouse;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import product.Fruit;
import product.IProductKind;
import product.Meat;
import product.ProductKindException;
import product.Vegetable;

public class Warehouse implements IWarehouse {
	private static final int SLEEP_TIME = 1_000;
	private static final int PRODUCT_LOW_AMMOUNT = 5;
	private static final int PRODUCT_LOAD_AMMOUNT = 20;
	private static String[][] names = { { "Banana", "Orange", "Apple" },
			{ "Potato", "Eggplant", "Cucumber" },
			{ "Pork", "Beef", "Chicken" } };
	private static final int DEFAULT_PRICE = 50;
	private static final int DEFAULT_AMMOUNT = 15;
	boolean stockNeedsToBeLoaded;
	Map<String, IProductKind> stock;

	public Warehouse() throws ProductKindException {
		stock = new ConcurrentHashMap<String, IProductKind>();

		for (int product = 0; product < names[0].length; product++) {
			String currentName = names[0][product];
			stock.put(currentName, new Fruit(DEFAULT_PRICE, currentName, DEFAULT_AMMOUNT));
		}
		for (int product = 0; product < names[1].length; product++) {
			String currentName = names[1][product];
			stock.put(currentName, new Vegetable(DEFAULT_PRICE, currentName, DEFAULT_AMMOUNT));
		}
		for (int product = 0; product < names[2].length; product++) {
			String currentName = names[2][product];
			stock.put(currentName, new Meat(DEFAULT_PRICE, currentName, DEFAULT_AMMOUNT));
		}
	}

	@Override
	public void loadStore() {
		stock.forEach((name, product) -> {
			if (product.getAmmount() <= PRODUCT_LOW_AMMOUNT) {
				try {
					System.out.println( product + " is low ... loading");
					Thread.sleep(SLEEP_TIME);
					System.out.println("After load: " + product + "\n");
					product.increaseAmmount(DEFAULT_AMMOUNT);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		this.stockNeedsToBeLoaded = false;
	}

	@Override
	public int takeProduct(String name) {
		IProductKind toBeSold = stock.get(name);
		System.out.println(toBeSold + " is beiing sold from warehouse. \n");
		try {
			Thread.sleep(SLEEP_TIME);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		if (toBeSold.getAmmount() >= PRODUCT_LOAD_AMMOUNT) {
			try {
				toBeSold.reduceAmmount(PRODUCT_LOAD_AMMOUNT);
			} catch (ProductKindException e) {
				e.printStackTrace();
			}
		}
		if (toBeSold.getAmmount() <= PRODUCT_LOW_AMMOUNT) {
			this.stockNeedsToBeLoaded = true;
			System.out.println("Warehouse starts loading: \n");
			try {
				Thread.sleep(SLEEP_TIME);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			loadStore();
		}

		return PRODUCT_LOAD_AMMOUNT;
	}

	@Override
	public boolean needsToBeLoaded() {
		return this.stockNeedsToBeLoaded;
	}

}
