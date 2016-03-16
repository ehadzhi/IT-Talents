package shipment;

import java.time.LocalDateTime;

import customers.ICustomer;

public interface IShipment {

	ICustomer getReceiver();

	LocalDateTime getCreationTime();

	int getID();

}