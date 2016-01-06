import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		int number, firstDigit, secondDigit, thirdDigit;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a three digit number : ");
		number = sc.nextInt();
		sc.close();
		
		firstDigit = number/100;
		secondDigit = (number/10)%10;
		thirdDigit = number%10;
		
		if( (firstDigit == secondDigit) && (secondDigit == thirdDigit)){
			System.out.println("All the digits of the number are equal");
		}
		else if( (firstDigit > secondDigit) && (secondDigit > thirdDigit)){
			System.out.println("The digits are in ascending order");
		}
		else if( (firstDigit < secondDigit) && (secondDigit < thirdDigit)){
			System.out.println("The digits are in descending order");
		}
		else{
			System.out.println("The digits are unordered");
		}
			
	}

}
