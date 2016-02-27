package product;

public class Fruit extends ProductKind {

	private static final String TYPE_NAME = "Fruit";
	private static String[] names = { "Banana", "Orange", "Apple" };

	public Fruit(double price, String name, int ammount) throws ProductKindException {
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
