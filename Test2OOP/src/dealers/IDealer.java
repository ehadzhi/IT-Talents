package dealers;

import helpers.Order;
import providers.IProvider;
import shoppingCentres.IShoppingCentre;
import shoppingCentres.ShoppingCentre;

public interface IDealer {
	
	boolean makeOrder(IProvider provider,Order order,IShoppingCentre orderFor);
	
	void startDealing();
	
	boolean takeTurnover(IShoppingCentre toTakeFrom);
	
	// pays taxes of Shops owned by him
	boolean payTaxes();

	boolean addShoppingCentre(IShoppingCentre toAdd);
	
	boolean addProvider(IProvider toAdd);
}
