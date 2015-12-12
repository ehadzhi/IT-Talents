package Task1;

public class Computer {
	int year;
	float price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	String operatingSystem;

	public Computer() {
		this.isNotebook = false;
		this.operatingSystem = "Win XP";
	}

	public Computer(int year, float price, int hardDiskMemory, int freeMemory) {
		this();

		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}

	public int comparePrice(Computer other) {
		if (this.price > other.price) {
			return 1;
		} else {
			if (this.price < other.price) {
				return -1;
			}
		}
		return 0;
	}

	public void changeOperatingSystem(String newOS) {
		if (newOS != null && !newOS.equals("")) {
			operatingSystem = newOS;
		}
	}

	public void useMemory(int memory) {
		if (memory > freeMemory) {
			System.out.println("Not enough free memory");
			return;
		}
		freeMemory -= memory;
	}

	public static void main(String[] args) {
		Computer lenovo = new Computer(2012, 2333f, 750, 500);
		Computer asus = new Computer(2015, 1299f, 900, 1234);

		System.out.println(lenovo.comparePrice(asus));
	}

}