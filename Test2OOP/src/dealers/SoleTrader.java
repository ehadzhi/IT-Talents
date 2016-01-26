package dealers;

import providers.IProvider;
import providers.RetailProvider;
import shoppingCentres.IShoppingCentre;
import shoppingCentres.MarketStall;
import shoppingCentres.StreetBooth;

public class SoleTrader extends Dealer implements IDealer {
	
	private static final int MAX_PROVIDERS = 5; 
	private static final int MAX_CENTRES = 1;

	public SoleTrader(String name, String addres, double money) {
		super(name, addres, money, MAX_PROVIDERS, MAX_CENTRES);
	}

	@Override
	public boolean addShoppingCentre(IShoppingCentre toAdd) {
		if (toAdd != null && (toAdd instanceof StreetBooth || toAdd instanceof MarketStall)) {
			return super.addShoppingCentre(toAdd);
		}
		return false;
	}

	@Override
	public boolean addProvider(IProvider toAdd) {
		if (toAdd != null && toAdd instanceof RetailProvider) {
			return super.addProvider(toAdd);
		}
		return false;
	}
}
