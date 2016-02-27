package instrument;

public interface IInstrumentKind {
	
	String getName();
	
	String getType();
	
	double getPrice();
	
	int getAmmount();
	
	void reduceAmmount(int toReduceBy) throws InstrumentKindException;
	
	void increaseAmmount(int toIncreaseBy) throws InstrumentKindException;
}
