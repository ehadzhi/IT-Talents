package couriers;

import java.util.concurrent.BlockingQueue;

import offices.IOffice;
import shipment.IShipment;

public class CourierToCustomer extends Courier {

	public CourierToCustomer(BlockingQueue<IShipment> workQueue, IOffice workPlace) throws CourierException {
		super(workQueue, workPlace);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		while( true){
			try {
				System.out.println("E toq go razdadoh " + workQueue.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}
		}
	}

}
