package shoppingCentres;

public class MallShop extends ShoppingCentre implements IShoppingCentre {

	private static final int MAX_AREA = 100;
	private static final int MIN_AREA = 10;
	private static final int MALL_SHOP_TAX = 150;

	private MallShop(String addres, String workTime, double area, double tax) {
		super(addres, workTime, area, tax);
	}
	
	public static MallShop getInstance(String addres, String workTime, double area){
		if( area >= MIN_AREA && area <= MAX_AREA){
			return new MallShop(addres, workTime, area, MALL_SHOP_TAX);
		}
		return null;
	}

}
