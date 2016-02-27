package instrument;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class InstrumentKind implements IInstrumentKind {

	private double price;
	private String name;
	private AtomicInteger ammount;

	public InstrumentKind(double price,String name,int ammount) throws InstrumentKindException {
		if( name != null && !name.equals("") && price > 0.0 && ammount > 0 ){
			this.name = name;
			this.ammount = new AtomicInteger(ammount);
			this.price = price;
		}
		else{
			throw new InstrumentKindException("Invalid initial parameteres:/n "
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
	public void reduceAmmount(int toReduceBy) throws InstrumentKindException {
		synchronized (ammount) {
			if (toReduceBy > 0 || ammount.get() >= toReduceBy) {
				ammount.addAndGet(-toReduceBy);
			} else {
				throw new InstrumentKindException(
						"Invalid reducing ammount: " + "You wanted to reduce " + ammount.get() + " by " + toReduceBy);
			}
		}
	}

	@Override
	public void increaseAmmount(int toIncreaseBy) throws InstrumentKindException {
		synchronized (ammount) {
			if (toIncreaseBy > 0) {
				ammount.addAndGet( toIncreaseBy);
			} else {
				throw new InstrumentKindException(
						"Invalid increasing ammount: " + "You wanted to increase " + ammount.get() + " by " + toIncreaseBy);
			}
		}
	}

}
