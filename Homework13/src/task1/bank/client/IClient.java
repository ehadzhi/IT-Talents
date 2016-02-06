package task1.bank.client;

import task1.bank.IBank;
import task1.bank.product.ProductExeption;

public interface IClient {
	boolean takeLoan(IBank toTakeFrom,int rate
			,int period,double money);

	boolean depositMoney(IBank toDepositIn,int rate
			,int period,double money);
	
	void print();
	
	String getName();
	
	double getMonthlyPay();
	
	double getCapital();
}
