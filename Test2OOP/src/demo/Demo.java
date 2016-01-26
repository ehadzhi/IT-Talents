package demo;

import providers.*;
import shoppingCentres.*;
import dealers.*;

public class Demo {

	public static void main(String[] args) {
		IProvider providers[] = getRandomProviders(10);
		IShoppingCentre shoppingCentres[] = getRandomShoppingCentres(20);
		IDealer dealers[] = { new Peddler("Peddler", "Sofia", 100), new SoleTrader("Sole trader", "Sofia", 500),
				new Retailer("Fantastiko", "Sofia", 3_000) };

		addCentresAndProvidersToDealers(providers, shoppingCentres, dealers);
		startDealing(dealers);
		
		for (IDealer dealer : dealers) {
			dealer.payTaxes();
		}

	}

	private static void startDealing(IDealer[] dealers) {
		for (IDealer dealer : dealers) {
			dealer.startDealing();
		}
	}

	private static void addCentresAndProvidersToDealers(IProvider[] providers, IShoppingCentre[] shoppingCentres,
			IDealer[] dealers) {
		for (int index = 0,providersIndex; index < shoppingCentres.length; index++) {
			providersIndex = 0;
			while (providersIndex < dealers.length && !dealers[providersIndex]
					.addShoppingCentre(shoppingCentres[index]) ){
				providersIndex++;
			}
		}
		
		for (IDealer dealer : dealers) {
			for (IProvider provider : providers) {
				dealer.addProvider(provider);
			}
		}
	}

	private static IShoppingCentre[] getRandomShoppingCentres(int numCentres) {
		IShoppingCentre shoppingCentres[] = new IShoppingCentre[numCentres];
		int determineType = 0;
		for (int index = 0; index < shoppingCentres.length; index++) {
			determineType = (int) (Math.random() * 3);
			switch (determineType) {
			case 0:
				shoppingCentres[index] = MallShop.getInstance("Mall shop", "9 to 5", (int) (Math.random() * 90 + 10));
				break;
			case 1:
				shoppingCentres[index] = MarketStall.getInstance("Market Stall", "9 to 5",
						(int) (Math.random() * 8 + 2));
				break;
			case 2:
				shoppingCentres[index] = StreetBooth.getInstance("Streeth booth", "9 to 5",
						(int) (Math.random() * 2 + 4));
				break;
			default:
				break;
			}
		}
		return shoppingCentres;
	}

	private static IProvider[] getRandomProviders(int numProviders) {
		IProvider providers[] = new IProvider[numProviders];
		int determineType;
		for (int index = 0; index < providers.length; index++) {
			determineType = (int) (Math.random() * 2);
			if (determineType == 0) {
				providers[index] = new RetailProvider("Some Name Retail", "Sofia", "9 to 5");
			} else {
				providers[index] = new WholeSaleProvider("Some Name Whole sale", "Sofia", "9 to 5");
			}
		}
		return providers;
	}

}
