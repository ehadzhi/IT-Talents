package task1.bank;

import java.util.Map;
import java.util.TreeMap;

import task1.bank.client.IClient;
import task1.bank.product.Deposit;
import task1.bank.product.Loan;
import task1.bank.product.ProductExeption;

public class Bank implements IBank {
	private static final int CONSUMER_CREDIT_RATE = 10;
	private static final int HOME_CREDIT_RATE = 6;
	private static final double RESEVRE_COEFFICIENT = 0.9;
	private static final int AVERAGE_BANK_MONEY = 10_000;
	private static final int BANK_MONEY_VARIATION = 500;
	private String name;
	private String addres;
	private Map<IClient, Deposit> deposits;
	private Map<IClient, Loan> loans;
	private double capital;

	public Bank(String name, String addres) throws BankException {
		super();
		setName(name);
		setAddres(addres);
		deposits = new TreeMap<IClient, Deposit>((one, two) -> one.getName().compareTo(two.getName()));
		loans = new TreeMap<IClient, Loan>((one, two) -> one.getName().compareTo(two.getName()));
		capital = (Math.random() * Bank.BANK_MONEY_VARIATION) + Bank.AVERAGE_BANK_MONEY;
	}

	@Override
	public boolean giveLoan(IClient owner, int rate,
			int period, double money) throws ProductExeption {
		if (owner != null 
				&& canClientPay(owner, rate, period, money) 
				&& money < getReserve()) {
			if (rate == HOME_CREDIT_RATE && period > 0) {
				addLoan(owner, rate, period, money, "Home credit");
				return true;
			}
			if (rate == CONSUMER_CREDIT_RATE && period > 0) {
				addLoan(owner, rate, period, money, "Consumer credit");
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean acceptDeposit(IClient owner, int rate, int period, double money) throws ProductExeption {
		if( owner != null && owner.getCapital() > money && money > 0){
			if(rate == 3 && period == 3 ){
				addDeposit(owner, rate, period, money, "Short Deposit");
				return true;
			}
			if( rate == 5 && period == 12 ){
				addDeposit(owner, rate, period, money, "Long Deposit");
				return true;
			}
		}
		return false;
	}

	private void addDeposit(IClient owner, int rate, int period, double money, String name) throws ProductExeption {
		deposits.put(owner, new Deposit(name,rate, period, money));
		this.capital += money;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) throws BankException {
		if (name != null && !name.equals("")) {
			this.name = name;
		} else {
			throw new BankException("Invalid bank name");
		}
	}

	public String getAddres() {
		return addres;
	}

	private void setAddres(String addres) throws BankException {
		if (addres != null && !addres.equals("")) {
			this.addres = addres;
		} else {
			throw new BankException("Invalid bank addres");
		}
	}

	public double getCapital() {
		return capital;
	}

	private void addLoan(IClient owner, int rate, int period, double money, String name) throws ProductExeption {
		loans.put(owner, new Loan(name, rate, period, money));
		this.capital -= money;
	}

	private boolean canClientPay(IClient owner, int rate, int period, double money) {
		return owner.getMonthlyPay() > (money * (((double) rate) / 100)) / period;
	}

	private double getReserve() {
		return RESEVRE_COEFFICIENT * capital;
	}

	@Override
	public String toString() {
		return name + ", adr= " + addres + ", $=" + String.format("%G", capital) +
				", reserve$= " + String.format("%G", getReserve()) +
				",\ndeposits=" + deposits + ",\nloans=" + loans;
	}
	

}
