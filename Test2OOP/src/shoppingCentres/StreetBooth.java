package shoppingCentres;

public class StreetBooth extends ShoppingCentre implements IShoppingCentre {

	private static final int MAX_AREA = 6;
	private static final int MIN_AREA = 4;
	private static final int STREET_BOOTH_TAX = 50;

	private StreetBooth(String addres, String workTime, double area, double tax) {
		super(addres, workTime, area, tax);
	}
	
	public static StreetBooth getInstance(String addres, String workTime, double area){
		if( area >= MIN_AREA && area <= MAX_AREA){
			return new StreetBooth(addres, workTime, area, STREET_BOOTH_TAX);
		}
		return null;
	}

}
