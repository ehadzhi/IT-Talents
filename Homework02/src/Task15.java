import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		int number, sum = 1,numberClone;   //sum = 1 (we don't add 1 in the cycle)
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		number = sc.nextInt();
		
		numberClone = number;
		do {
			sum += numberClone;
			if (numberClone > 1) {
				numberClone--;
			} 
			else {
				numberClone++;
			}
		} while (numberClone != 1);
		System.out.println("The sum from " + 1 + " to " + number + " is : " + sum);
		sc.close();
	}

}
