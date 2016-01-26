package dealers;

import providers.IProvider;
import providers.RetailProvider;
import shoppingCentres.IShoppingCentre;
import shoppingCentres.MallShop;
import shoppingCentres.MarketStall;
import shoppingCentres.ShoppingCentre;
import shoppingCentres.StreetBooth;

public class Retailer extends Dealer implements IDealer {

	private static final int MAX_PROVIDERS = 15;
	private static final int MAX_CENTRES = 10;

	public Retailer(String name, String addres, double money) {
		super(name, addres, money, MAX_PROVIDERS, MAX_CENTRES);
	}

	@Override
	public boolean addShoppingCentre(IShoppingCentre toAdd) {
		if (toAdd != null && (toAdd instanceof ShoppingCentre || toAdd instanceof MallShop)) {
			return super.addShoppingCentre(toAdd);
		}
		return false;
	}

}
