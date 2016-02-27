package product;

public class Vegetable extends ProductKind {

	private static final String TYPE_NAME = "Vegetable";
	private static String[] names = { "Potato", "Eggplant", "Cucumber" };

	public Vegetable(double price, String name, int ammount) throws ProductKindException {
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
