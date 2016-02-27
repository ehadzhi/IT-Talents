package product;

public class Meat extends ProductKind {

	private static final String TYPE_NAME = "Meat";
	private static String[] names = { "Pork", "Beef", "Chicken" };

	public Meat(double price, String name, int ammount) throws ProductKindException {
		super(price, name, ammount);
		if (!validateName(name, names)) {
			throw new ProductKindException("Invalid name: " + name);
		}
	}

	@Override
	public String getType() {
		return TYPE_NAME;
	}

}
