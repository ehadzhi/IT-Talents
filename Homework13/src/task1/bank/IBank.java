package task1.bank;

import task1.bank.client.IClient;
import task1.bank.product.ProductExeption;

public interface IBank {
	
	boolean giveLoan(IClient owner,int rate
			,int period,double money) throws ProductExeption;
	
	boolean acceptDeposit(IClient owner,
			int rate,int period,double money) throws ProductExeption;
	
}
