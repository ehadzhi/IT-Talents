import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		int num1, num2, swap, sum = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter two numbers : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		if (num1 > num2) {
			swap = num1;
			num1 = num2;
			num2 = swap;
		}

		for (int i = num1; i <= num2; i++) {
			if (sum > 200) {
				break;
			}
			if (i != num1) {
				System.out.print(", ");
			}
			if (i % 3 == 0) {
				System.out.print("skip 3");
				continue;
			} 
			else {
				System.out.print(i*i);
				sum += i * i;
			}

		}

		sc.close();

	}

}
