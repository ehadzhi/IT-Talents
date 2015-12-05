import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		int number;
		boolean isPrime = true;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		number = sc.nextInt();

		for (int i = 2; i < number; i++) {
			if( number % i == 0){
				isPrime = false;
				break;
			}
		}
		
		if( isPrime ) {
			System.out.println( number + " is prime.");
		}
		else {
			System.out.println( number + " is not prime.");
		}
		sc.close();
	}

}
