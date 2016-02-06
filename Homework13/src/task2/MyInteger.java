package task2;

public class MyInteger {

	private int value;
	
	public MyInteger(int value) {
		this.value = value;
	}
	
	int getValue(){
		return value;
	}
	
	void increment(){
		value++;
	}
	
	@Override
	public String toString() {
		return "" + value;
	}

}
