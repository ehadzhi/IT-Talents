package task1.bank.client;

import task1.bank.IBank;
import task1.bank.product.ProductExeption;

public class Client implements IClient {
	private static final int MONTHLY_PAY_BASE = 500;
	private static final int MONTHLY_PAY_RANGE = 2_000;
	private static final int CAPITAL_BASE = 1_000;
	private static final int CAPITAL_RANGE = 1_000;
	private String name;
	private String addres;
	private double capital;
	private double monthlyPay;

	public Client(String name, String addres) throws ClientException {
		setName(name);
		setAddres(addres);
		capital = (Math.random() * Client.CAPITAL_RANGE) + Client.CAPITAL_BASE;
		monthlyPay = (Math.random() * Client.MONTHLY_PAY_RANGE) + Client.MONTHLY_PAY_BASE;
	}

	@Override
	public boolean takeLoan(IBank toTakeFrom, int rate, int period, double money) {
		try {
			if (toTakeFrom != null) {
				if (toTakeFrom.giveLoan(this, rate, period, money)) {
					this.capital += money;
					return true;
				}
			}
		} catch (ProductExeption e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean depositMoney(IBank toDepositIn, int rate, int period, double money){
		try {
			if (toDepositIn != null) {
				if (toDepositIn.acceptDeposit(this, rate, period, money)) {
					this.capital -= money;
					return true;
				}
			}
		} catch (ProductExeption e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getMonthlyPay() {
		return monthlyPay;
	}

	@Override
	public double getCapital() {
		return capital;
	}

	private void setName(String name) throws ClientException {
		if (name != null & !name.equals("")) {
			this.name = name;
			return;
		}
		throw new ClientException("Invalid name");
	}

	private void setAddres(String addres) throws ClientException {
		if (addres != null & !addres.equals("")) {
			this.addres = addres;
			return;
		}
		throw new ClientException("Invalid addres");

	}

	
	
	@Override
	public String toString() {
		return "\n" + name;
	}

	@Override
	public void print() {
		System.out.println(name + ", adr= " + addres + ", $= "  +
	String.format("%G",capital) + ", $month= " + String.format("%G",monthlyPay));
		
	}

}
