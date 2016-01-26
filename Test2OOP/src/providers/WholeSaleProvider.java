package providers;

import helpers.Order;

public class WholeSaleProvider extends Provider implements IProvider {

	public WholeSaleProvider(String name, String addres, String workTime) {
		super(name, addres, workTime);
	}
	
	@Override
	public double takeOrder(Order toTake) {
		return toTake.getPrice()/(0.85);
	}
}
