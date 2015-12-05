import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		int number;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a three digit number : ");
		number = sc.nextInt();
		
		if( (number % (number % 10)) == 0 
		&& 	(number % ((number/10) % 10) == 0)
		&&  (number % ((number/100) % 10) == 0)) {
			System.out.println(number + " is divisible by all its digits");
		}
		else 
			System.out.println(number + " is not divisible by all its digits");
		
		sc.close();
	}

}
