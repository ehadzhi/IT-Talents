package couriers;

import java.util.List;
import java.util.concurrent.BlockingQueue;

import customers.ICustomer;
import offices.IOffice;
import shipment.IShipment;

public class CourierFromCustumer extends Courier {
	private List<ICustomer> customersToTakeFrom;

	public CourierFromCustumer(BlockingQueue<IShipment> workQueue, IOffice workPlace,
			List<ICustomer> customersToTakeFrom) throws CourierException {
		super(workQueue, workPlace);
		setCustomersToTakeFrom(customersToTakeFrom);

	}

	private void setCustomersToTakeFrom(List<ICustomer> customersToTakeFrom) throws CourierException {
		if (customersToTakeFrom != null) {
			this.customersToTakeFrom = customersToTakeFrom;
			return;
		}
		throw new CourierException("Invalid Custumer list");
	}

	@Override
	public void run() {
		while (true) {
			customersToTakeFrom.forEach(customer -> workQueue.add(customer.getShipment()));
		}

	}

}
