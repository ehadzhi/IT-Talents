package providers;

import helpers.Order;

public interface IProvider {
	
	double takeOrder(Order toTake);
	
}
