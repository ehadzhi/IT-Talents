public class Computer {
	int year;
	float price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	String operatingSystem;

	void changeOperatingSystem(String newOS) {
		if (newOS != null && !newOS.equals("")) {
			operatingSystem = newOS;
		}
	}

	void useMemory(int memory) {
		if (memory > freeMemory) {
			System.out.println("Not enough free memory");
			return;
		}
		freeMemory -= memory;
	}

}
