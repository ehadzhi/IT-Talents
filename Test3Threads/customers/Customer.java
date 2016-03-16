package customers;

import shipment.IShipment;
import shipment.Shipment;
import shipment.ShipmentException;
import towns.ITown;

public abstract class Customer implements ICustomer {

	private static final String DEFAULT_SHIPMENT_CONTAINS = "Neshto nezakonno";

	@Override
	public String toString() {
		return "Customer [Name=" + Name + ", livingTown=" + livingTown + ", addres=" + addres + ", uniqueID=" + uniqueID
				+ "]";
	}

	private String Name;
	private ITown livingTown;
	private String addres;
	private int uniqueID;

	public Customer(String name, ITown livingTown, String addres, int uniqueID) throws CustomerException {
		setName(name);
		setAddres(addres);
		setLivingTown(livingTown);
		setUniqueID(uniqueID);
	}

	private void setUniqueID(int uniqueID) throws CustomerException {
		if (uniqueID < 0) {
			this.uniqueID = uniqueID;
		}
		throw new CustomerException("Invalid uniqueID=" + uniqueID);
	}

	/* (non-Javadoc)
	 * @see customers.ICustomer#getUniqueID()
	 */
	@Override
	public int getUniqueID() {
		return uniqueID;
	}

	private void setLivingTown(ITown livingTown) throws CustomerException {
		if (livingTown != null) {
			this.livingTown = livingTown;
			return;
		}
		throw new CustomerException("Invalid livingTown=" + livingTown);
	}

	/* (non-Javadoc)
	 * @see customers.ICustomer#getName()
	 */
	@Override
	public String getName() {
		return Name;
	}
	
	@Override
	public IShipment getShipment() {
		try {
			return new Shipment(this, this, DEFAULT_SHIPMENT_CONTAINS);
		} catch (ShipmentException e) {
			e.printStackTrace();
		}
		return null;
	}

	private void setName(String name) throws CustomerException {
		if (name != null && !name.equals("")) {
			Name = name;
			return;
		}
		throw new CustomerException("Invalid name=" + name);
	}

	/* (non-Javadoc)
	 * @see customers.ICustomer#getLivingTown()
	 */
	@Override
	public ITown getLivingTown() {
		return livingTown;
	}

	private void setAddres(String addres) throws CustomerException {
		if (addres != null && !addres.equals("")) {
			this.addres = addres;
			return;
		}
		throw new CustomerException("Invalid addres=" + addres);
	}

}
