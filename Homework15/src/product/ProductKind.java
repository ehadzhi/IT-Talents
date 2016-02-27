package product;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class ProductKind implements IProductKind {

	private double price;
	private String name;
	private AtomicInteger ammount;
	
	
	public ProductKind(double price,String name,int ammount) throws ProductKindException {
		if( name != null && !name.equals("") && price > 0.0 && ammount > 0 ){
			this.name = name;
			this.ammount = new AtomicInteger(ammount);
			this.price = price;
		}
		else{
			throw new ProductKindException("Invalid initial parameteres:/n "
					+ "You tried: name, price, ammount: " + name + ", " + price
					+ ", " + ammount);
 		}
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public int getAmmount() {
		return ammount.get();
	}

	@Override
	public void reduceAmmount(int toReduceBy) throws ProductKindException {
		synchronized (ammount) {
			if (toReduceBy > 0 || ammount.get() >= toReduceBy) {
				ammount.addAndGet(-toReduceBy);
			} else {
				throw new ProductKindException(
						"Invalid reducing ammount: " + "You wanted to reduce " + ammount.get() + " by " + toReduceBy);
			}
		}
	}

	@Override
	public void increaseAmmount(int toIncreaseBy) throws ProductKindException {
		synchronized (ammount) {
			if (toIncreaseBy > 0) {
				ammount.addAndGet( toIncreaseBy);
			} else {
				throw new ProductKindException(
						"Invalid increasing ammount: " + "You wanted to increase " + ammount.get() + " by " + toIncreaseBy);
			}
		}
	}
	
	protected boolean validateName(String name, String[] names) {
		for (int i = 0; i < names.length; i++) {
			if ( names[i].equalsIgnoreCase(name.toLowerCase())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return " [" + this.getType() +", " + name +  ", $= " + price + ", inStock = " + ammount  + "]";
	}

}
