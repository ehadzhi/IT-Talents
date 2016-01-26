package dealers;

import helpers.Order;
import helpers.StringChecker;
import providers.IProvider;
import providers.Provider;
import shoppingCentres.IShoppingCentre;
import shoppingCentres.ShoppingCentre;

public abstract class Dealer implements IDealer {
	private final int MAX_PROVIDERS;
	private final int MAX_CENTRES;
	protected String name;
	private String addres;
	private double money;

	private ShoppingCentre[] shoppingCentres;
	private int numCentres;

	protected Provider[] providers;
	private int numProviders;

	public double getMoney() {
		return money;
	}

	public Dealer(String name, String addres, double money, int MAX_PROVIDERS, int MAX_CENTRES) {
		if (StringChecker.checkString(name) && StringChecker.checkString(addres) && money > 0 && MAX_CENTRES >= 0
				&& MAX_PROVIDERS >= 0) {
			this.name = name;
			this.addres = addres;
			this.money = money;
			this.MAX_CENTRES = MAX_CENTRES;
			this.MAX_PROVIDERS = MAX_PROVIDERS;

			shoppingCentres = new ShoppingCentre[MAX_CENTRES];
			providers = new Provider[MAX_PROVIDERS];

			numCentres = 0;
			numProviders = 0;
		} else {
			this.MAX_CENTRES = 0;
			this.MAX_PROVIDERS = 0;
		}
	}

	@Override
	public boolean makeOrder(IProvider provider, Order order, IShoppingCentre orderFor) {
		if (this.money >= 2 * order.getPrice() && provider != null) {
			this.money -= provider.takeOrder(order);
			if (orderFor != null) {
				orderFor.addOrder(order);
			}
			System.out.println("Order for " + name + " and " + orderFor + " : " + order);
			return true;
		}
		return false;
	}
	
	@Override
	public void startDealing() {
		
		for (IShoppingCentre centre : shoppingCentres) {
			for (IProvider provider : providers) {
				makeOrder(provider,new Order(), centre);
			}
		}
		System.out.println("After orders " + name + " - money :" + money);
		
		for (IShoppingCentre centre : shoppingCentres) {
			takeTurnover(centre);			
		}
		System.out.println("After turnover " + name + " - money :" + money);
		System.out.println();
		
		
	}

	@Override
	public boolean takeTurnover(IShoppingCentre toTakeFrom) {
		if (toTakeFrom != null) {
			this.money += toTakeFrom.giveTurnover();
			return true;
		}
		return false;
	}

	@Override
	public boolean payTaxes() {
		boolean toReturn = true;
		for (int index = 0; index < numCentres; index++) {
			toReturn &= payTaxes(shoppingCentres[index]);
		}
		System.out.println("After taxes " + name + " : " + money);
		System.out.println();
		return toReturn;
	}

	private boolean payTaxes(ShoppingCentre toPay) {
		if (toPay != null && this.money >= toPay.getTax()) {
			this.money -= toPay.getTax();
		}
		return false;
	}

	@Override
	public boolean addProvider(IProvider toAdd) {
		if (toAdd != null && numProviders < MAX_PROVIDERS) {
			providers[numProviders] = (Provider) toAdd;
			numProviders++;
			return true;
		}
		return false;
	}

	@Override
	public boolean addShoppingCentre(IShoppingCentre toAdd) {
		if (toAdd != null && numCentres < MAX_CENTRES) {
			shoppingCentres[numCentres] = (ShoppingCentre) toAdd;
			numCentres++;
			return true;
		}
		return false;
	}
	
	protected void setMoney(double toSet) {
		money = toSet;
	}

}
