package shipment;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

import customers.ICustomer;

public class Shipment implements IShipment {
	private static AtomicInteger currentID = new AtomicInteger(0);
	private final LocalDateTime creationTime;
	private final int ID;
	private ICustomer sender;
	private ICustomer receiver;
	private String contains;
	
	public Shipment(ICustomer sender, ICustomer receiver, String contains) throws ShipmentException {
		setContains(contains);
		setReceiver(receiver);
		setSender(sender);
		creationTime = LocalDateTime.now();
		ID = currentID.getAndIncrement();
	}

	private void setSender(ICustomer sender) throws ShipmentException {
		if (sender != null) {
			this.sender = sender;
			return;
		}
		throw new ShipmentException("Invalid Sender=" + sender);
	}

	/* (non-Javadoc)
	 * @see shipment.IShipment#getReceiver()
	 */
	@Override
	public ICustomer getReceiver() {
		return receiver;
	}

	private void setReceiver(ICustomer receiver) throws ShipmentException {
		if( receiver != null){
		this.receiver = receiver;
		return;
		}
		throw new ShipmentException("Invalid Receiver=" + receiver);
	}

	/* (non-Javadoc)
	 * @see shipment.IShipment#getCreationTime()
	 */
	@Override
	public LocalDateTime getCreationTime() {
		return creationTime;
	}

	/* (non-Javadoc)
	 * @see shipment.IShipment#getID()
	 */
	@Override
	public int getID() {
		return ID;
	}

	private void setContains(String contains) throws ShipmentException {
		if( contains != null && !contains.equals("")){
		this.contains = contains;
		return;
		}
		throw new ShipmentException("Invalid shpment caontains description=" + contains);
	}


}
