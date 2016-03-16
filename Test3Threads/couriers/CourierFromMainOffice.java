package couriers;

import java.util.concurrent.BlockingQueue;

import offices.IOffice;
import offices.OfficeException;
import shipment.IShipment;
import towns.ITown;

public class CourierFromMainOffice extends Courier {

	public CourierFromMainOffice(BlockingQueue<IShipment> workQueue, IOffice workPlace) throws CourierException {
		super(workQueue, workPlace);
	}

	@Override
	public void run() {
		while (true) {
			try {
				IShipment toGetToTownOffice = workQueue.take();
				ITown officeTown = toGetToTownOffice.getReceiver().getLivingTown();
				try {
					workPlace.getQueueforOfficeFromTown(officeTown).put(toGetToTownOffice);
				} catch (OfficeException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}
		}

	}

}
