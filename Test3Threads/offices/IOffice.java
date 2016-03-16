package offices;

import java.util.concurrent.BlockingQueue;

import shipment.IShipment;
import towns.ITown;

public interface IOffice {

	BlockingQueue<IShipment> getQueueForTown(ITown town) throws OfficeException;

	BlockingQueue<IShipment> getQueueforOfficeFromTown(ITown town) throws OfficeException;

	IOffice getMainOffice();
	
	ITown getLocation();
}
