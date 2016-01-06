import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		int num, numReversed = 0, numOfDigits = 0, clone, digit;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		num = sc.nextInt();

		clone = num;
		while (clone != 0) {
			clone /= 10;
			numOfDigits++;
		}

		clone = num;
		while (clone != 0) {
			digit = clone % 10;
			for (int i = 1; i < numOfDigits; i++) {
				digit *= 10;
			}
			numOfDigits--;
			numReversed += digit;
			clone /= 10;
		}
		
		if( (num - numReversed) == 0){
			System.out.println( num + " is a palindrome.");
		}
		else {
			System.out.println(num + " is not a palindrome.");
		}
	sc.close();
	}

}
