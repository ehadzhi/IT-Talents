package couriers;

import java.util.concurrent.BlockingQueue;

import offices.IOffice;
import offices.OfficeException;
import shipment.IShipment;
import towns.ITown;

public class CourierToMainOffice extends Courier{

	public CourierToMainOffice(BlockingQueue<IShipment> workQueue, IOffice workPlace) throws CourierException {
		super(workQueue, workPlace);
	}

	@Override
	public void run() {
		while(true){
			try {
				IShipment toGetToMainOffice = workQueue.take();
				ITown townToSendTo = toGetToMainOffice.getReceiver().getLivingTown();
				workPlace.getMainOffice().getQueueForTown(townToSendTo).put(toGetToMainOffice);
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			} catch (OfficeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
