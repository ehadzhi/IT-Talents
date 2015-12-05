import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		int number = 0, outerPart, innerPart;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		 while( number < 1000 || number > 9999) {
			 number = sc.nextInt();
		 }
		 
		 outerPart = (number/1000)*10 + (number % 10);
		 innerPart = + ((number/100)%10)*10 + ((number/10)%10);
		 
		 	System.out.print( outerPart);
		 if( outerPart < innerPart)
			 System.out.print(" < ");
		 else if( outerPart > innerPart)
			 System.out.print(" > ");
		 else if( outerPart == innerPart)
		 	System.out.print(" = ");
		 
		 System.out.print(innerPart);
		 
		 sc.close();
	}

}
