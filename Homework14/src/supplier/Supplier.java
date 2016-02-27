package supplier;

import java.util.concurrent.atomic.AtomicBoolean;

public class Supplier implements ISupplier{

	private static final int WAIT_TIME_RANGE = 3_000;
	private static final int WAIT_TIME_BASE = 1_000;
	AtomicBoolean shouldISupply;

	public Supplier(AtomicBoolean shouldIsupply) throws SupplierException {
		if(shouldIsupply != null){
			this.shouldISupply = shouldIsupply;
		}
		else{
			throw new SupplierException("Invalid wait variable.");
		}
	}
	
	@Override
	public int getSupplyTime() {
		return (int)(Math.random()*WAIT_TIME_RANGE + WAIT_TIME_BASE);
	}

}
