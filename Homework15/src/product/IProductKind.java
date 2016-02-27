package product;

public interface IProductKind {
	
	String getName();
	
	String getType();
	
	double getPrice();
	
	int getAmmount();
	
	void reduceAmmount(int toReduceBy) throws ProductKindException;
	
	void increaseAmmount(int toIncreaseBy) throws ProductKindException;
}
