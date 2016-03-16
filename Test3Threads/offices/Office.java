package offices;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import couriers.ICourier;
import shipment.IShipment;
import towns.ITown;

public class Office implements IOffice,Runnable{
	private ITown location;
	private IOffice mainOffice;
	private BlockingQueue<IShipment> shipmentsToBeGiven;
	private BlockingQueue<IShipment> shipmentsToBeTaken;
	private List<ICourier> takeFromCustomerCouriers;
	private List<ICourier> takeToCustomerCouriers;
	
	
	
	@Override
	public BlockingQueue<IShipment> getQueueForTown(ITown town) throws OfficeException {
		throw new OfficeException("Unsupported Operation");
	}

	@Override
	public BlockingQueue<IShipment> getQueueforOfficeFromTown(ITown town) throws OfficeException {
		throw new OfficeException("Unsupported Operation");
	}

	@Override
	public IOffice getMainOffice() {
		return mainOffice;
	}

	@Override
	public void run() {
		ExecutorService tasks = Executors.newCachedThreadPool();
		takeFromCustomerCouriers.forEach(courier -> tasks.execute((Runnable)courier));
		takeToCustomerCouriers.forEach(courier -> tasks.execute((Runnable)courier));
	}

	@Override
	public ITown getLocation() {
		return location;
	}


}
