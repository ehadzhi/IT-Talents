package shoppingCentres;

import helpers.Order;

public interface IShoppingCentre {
	
	double getTax();
	
	double giveTurnover();

	boolean addOrder(Order toAdd);
}
