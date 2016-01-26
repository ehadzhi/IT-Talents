package shoppingCentres;

public class MarketStall extends ShoppingCentre implements IShoppingCentre {

	private static final int MAX_AREA = 10;
	private static final int MIN_AREA = 2;
	private static final int MARKET_STALL_TAX = 50;

	private MarketStall(String addres, String workTime, double area, double tax) {
		super(addres, workTime, area, tax);
		// TODO Auto-generated constructor stub
	}
	
	public static MarketStall getInstance(String addres, String workTime, double area){
		if( area >= MIN_AREA && area <= MAX_AREA ){
			return new MarketStall(addres, workTime, area, MARKET_STALL_TAX);
		}
		return null;
	}
	
	

}
