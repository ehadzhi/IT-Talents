package customers;

import shipment.IShipment;
import towns.ITown;

public interface ICustomer {

	int getUniqueID();

	String getName();

	ITown getLivingTown();
	
	IShipment getShipment();

}