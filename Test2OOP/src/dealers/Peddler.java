package dealers;

import helpers.Order;
import providers.IProvider;
import providers.RetailProvider;
import shoppingCentres.IShoppingCentre;

public class Peddler extends Dealer implements IDealer {

	private static final double PROFIT_COEFICIENT = 1.2;
	private static final int MAX_PROVIDERS = 1;
	private static final int MAX_CENTRES = 0;

	private double lastOrderMoney;

	public Peddler(String name, String addres, double money) {
		super(name, addres, money, MAX_PROVIDERS, MAX_CENTRES);
		lastOrderMoney = 0;
	}

	@Override
	public boolean addProvider(IProvider toAdd) {
		if (toAdd != null && toAdd instanceof RetailProvider) {
			return super.addProvider(toAdd);
		}
		return false;
	}

	@Override
	public void startDealing() {
		for (IProvider provider : providers) {
			makeOrder(provider, new Order(), null);
		}
		System.out.println("after orders " + name + " - money :" + getMoney());
		takeTurnover(null);

		System.out.println("After turnover " + name + " - money :" + getMoney());
		System.out.println();
	}

	@Override
	public boolean takeTurnover(IShoppingCentre toTakeFrom) {
		setMoney(getMoney() + (lastOrderMoney * PROFIT_COEFICIENT));
		lastOrderMoney = 0;
		return true;
	}

	@Override
	public boolean makeOrder(IProvider provider, Order order, IShoppingCentre orderFor) {
		if (super.makeOrder(provider, order, orderFor)) {
			lastOrderMoney = order.getPrice();
			return true;
		}
		return false;
	}

}
