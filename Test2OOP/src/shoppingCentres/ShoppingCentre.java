package shoppingCentres;

import helpers.Order;
import helpers.StringChecker;

public abstract class ShoppingCentre implements IShoppingCentre {

	private static final double TRADER_CUT = 1.3;
	private static final int PROFIT_COEFFICIENT = 2;
	private String addres;
	private String workTime;
	private double area;
	private double tax;
	private double turnover;
	private boolean isTaxPaid;

	public ShoppingCentre(String addres, String workTime, double area, double tax) {
		if (StringChecker.checkString(addres) && StringChecker.checkString(workTime) && area > 0 && tax >= 0) {
			this.addres = addres;
			this.workTime = workTime;
			this.area = area;
			this.tax = tax;
			this.turnover = 0;
			this.isTaxPaid = false;
		}
	}
	
	public double getTax() {
		if( isTaxPaid ){
			return 0;
		}
		return tax;
	}
	
	@Override
	public boolean addOrder(Order toAdd) {
		if(toAdd.getPrice() > 0){
			this.turnover += toAdd.getPrice()*PROFIT_COEFFICIENT;
			return true;
		}
		return false;
	}

	@Override
	public double giveTurnover() {
		double toReturn = this.turnover/PROFIT_COEFFICIENT*TRADER_CUT;
		this.turnover -= toReturn;
		return toReturn;
	}
	
	@Override
	public String toString() {
		return addres;
	}
}
