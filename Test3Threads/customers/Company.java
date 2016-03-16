package customers;

import towns.ITown;

public class Company extends Customer {

	public Company(String name, ITown livingTown, String addres, int uniqueID) throws CustomerException {
		super(name, livingTown, addres, uniqueID);
	}

	@Override
	public String toString() {
		return "Company " + super.toString();
	}

}
