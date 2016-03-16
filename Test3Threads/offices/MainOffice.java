package offices;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import couriers.ICourier;
import shipment.IShipment;
import towns.ITown;

public class MainOffice implements IOffice , Runnable{
	static private String[] towns = { "Sofia", "Varna", "Ruse", "Plovdiv" };
	private ITown location;
	private List<IOffice> offices;
	private List<BlockingQueue<IShipment>> queueForEachOffice;
	private List<ICourier> takeFromHereCouriers;
	private List<ICourier> takeToHereCouriers;
	
	@Override
	public BlockingQueue<IShipment> getQueueForTown(ITown town) throws OfficeException {
		return null;
	}

	@Override
	public BlockingQueue<IShipment> getQueueforOfficeFromTown(ITown town) throws OfficeException {
		return null;
	}

	@Override
	public IOffice getMainOffice() {
		return this;
	}

	@Override
	public ITown getLocation() {
		return location;
	}

	@Override
	public void run() {
		ExecutorService tasks = Executors.newCachedThreadPool();
		takeFromHereCouriers.forEach(courier -> tasks.execute((Runnable)courier));
		takeToHereCouriers.forEach(courier -> tasks.execute((Runnable)courier));
		
	}

}
