package customers;

import towns.ITown;

public class Citizen extends Customer {

	public Citizen(String name, ITown livingTown, String addres, int uniqueID) throws CustomerException {
		super(name, livingTown, addres, uniqueID);
	}

	@Override
	public String toString() {
		return "Citizen " + super.toString();
	}

}
