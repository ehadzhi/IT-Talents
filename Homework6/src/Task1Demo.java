
public class Task1Demo {
	
	static void outputComp(Computer comp){
		System.out.println("OS : " + comp.operatingSystem);
		System.out.println("Year : " + comp.year);
		System.out.println("Free memory :" + comp.freeMemory);
		System.out.println("HDD : " + comp.hardDiskMemory);
		System.out.println("Is a notebook : " + comp.isNotebook);
		System.out.println("Price : " + comp.price);
	}

	public static void main(String[] args) {
		Computer linux = new Computer(),mac = new Computer();
		
		linux.operatingSystem = "Ubuntu";
		linux.freeMemory = 700;
		linux.year = 2012;
		linux.isNotebook = false;
		linux.hardDiskMemory = 750;
		linux.price = 650;
		
		mac.operatingSystem = "Mac OS";
		mac.freeMemory = 800;
		mac.year = 2014;
		mac.isNotebook = true;
		mac.hardDiskMemory = 1000;
		mac.price = 2999;
		
		linux.useMemory(100);
		
		mac.changeOperatingSystem("Hackintosh");
		
		outputComp(linux);
		System.out.println();
		outputComp(mac);

	}

}
