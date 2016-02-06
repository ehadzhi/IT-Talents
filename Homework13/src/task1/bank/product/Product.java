package task1.bank.product;

import task1.bank.client.IClient;

public abstract class Product implements IProduct {

	private static final int PERIOD_MIN_MONTHS = 1;
	private static final int PERIOD_MAX_MONTHS = 60;
	private String name;
	private int interestRate;
	private int productPeriod;
	private double ammountMoney;

	public Product(String name, int yearlyInterestRate,
			int productPeriod, double ammountMoney)
					throws ProductExeption {
		setName(name);
		setYearlyInterestRate(yearlyInterestRate);
		setProductPeriod(productPeriod);
		setAmmountMoney(ammountMoney);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws ProductExeption {
		if (name != null && !name.equals("")) {
			this.name = name;
		} else {
			throw new ProductExeption("Invalid name");
		}
	}

	public int getInterestRate() {
		return interestRate;
	}

	public void setYearlyInterestRate(int yearlyInterestRate) throws ProductExeption {
		if (yearlyInterestRate > 0) {
			this.interestRate = yearlyInterestRate;
		} else {
			throw new ProductExeption("Ivalid interest Rate = " + yearlyInterestRate);
		}
	}

	public int getProductPeriod() {
		return productPeriod;
	}

	public void setProductPeriod(int productPeriod) {
		if( productPeriod >= Product.PERIOD_MIN_MONTHS 
				|| productPeriod <= Product.PERIOD_MAX_MONTHS)
		this.productPeriod = productPeriod;
	}

	public double getAmmountMoney() {
		return ammountMoney;
	}

	public void setAmmountMoney(double ammountMoney) {
		this.ammountMoney = ammountMoney;
	}

	@Override
	public String toString() {
		return ", name= " + name + ", rate= " + interestRate + "%, period= "
				+ productPeriod + " months, ammount$= " + String.format("%G",ammountMoney);
	}

}
