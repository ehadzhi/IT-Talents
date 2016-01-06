import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		int sum, digit1, digit2, digit3;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a sum : ");
		sum = sc.nextInt();

		for (int i = 100; i < 1000; i++) {
			digit1 = i % 10;
			digit2 = (i / 10) % 10;
			digit3 = (i / 100) % 100;
			if ((digit1 + digit2 + digit3) == sum) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}

}
