package couriers;

import java.util.concurrent.BlockingQueue;

import offices.IOffice;
import shipment.IShipment;

public abstract class Courier implements Runnable, ICourier {
	protected IOffice workPlace;
	protected BlockingQueue<IShipment> workQueue;

	public Courier(BlockingQueue<IShipment> workQueue, IOffice workPlace) throws CourierException {
		setWorkQueue(workQueue);
	}

	private void setWorkPlace(IOffice workPlace) throws CourierException {
		if (workPlace != null) {
			this.workPlace = workPlace;
			return;
		}
		throw new CourierException("Invalid workPlace=" + workPlace);
	}

	private void setWorkQueue(BlockingQueue<IShipment> workQueue) throws CourierException {
		if (workQueue != null) {
			this.workQueue = workQueue;
		} else {
			throw new CourierException("Invalid working queue=" + workQueue);
		}
	}

}
