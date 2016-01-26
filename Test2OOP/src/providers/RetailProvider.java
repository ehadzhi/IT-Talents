package providers;

import helpers.Order;

public class RetailProvider extends Provider implements IProvider {

	public RetailProvider(String name, String addres, String workTime) {
		super(name, addres, workTime);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double takeOrder(Order order) {
		return order.getPrice();
	}

}
