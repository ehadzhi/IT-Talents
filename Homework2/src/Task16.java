import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		int num1, num2, swap;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter two numbers : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		if (num1 < num2) {
			swap = num1;
			num1 = num2;
			num2 = swap;
		}

		for (int i = num1; i >= num2; i--) {
			if (i % 50 == 0) {
				System.out.print(i + " ");
			}
			sc.close();
		}
	}
}