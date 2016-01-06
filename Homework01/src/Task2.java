import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		int firtstInt, secondInt,
		intSum, intDiffr, intQuotient, intRemainder; 
		
		float firtstFloat, secondFloat,
		floatSum, floatDiffr, floatQuotient, floatRemainder;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first integer : ");
		firtstInt = sc.nextInt();
		System.out.print("Enter the second integer : ");
		secondInt = sc.nextInt();
		
		intSum = firtstInt + secondInt;
		intDiffr = firtstInt - secondInt;
		intQuotient = firtstInt / secondInt;
		intRemainder = firtstInt % secondInt;
		
		System.out.println("Their sum is : " + intSum);
		System.out.println("Their difference is : " + intDiffr);
		System.out.println("Their whole number quotient is : " + intQuotient);
		System.out.println("Their remainder is : " + intRemainder + "\n");
		
		System.out.print("Enter the first float : ");
		firtstFloat = sc.nextFloat();
		System.out.print("Enter the second float : ");
		secondFloat = sc.nextFloat();
		
		floatSum = firtstFloat + secondFloat;
		floatDiffr = firtstFloat - secondFloat;
		floatQuotient = (int)(firtstFloat / secondFloat);
		floatRemainder = firtstFloat % secondFloat;
		
		System.out.println("Their sum is : " + floatSum);
		System.out.println("Their difference is : " + floatDiffr);
		System.out.println("Their whole number quotient is : " + floatQuotient);
		System.out.println("Their remainder is : " + floatRemainder);
		
		sc.close();
	}

}
