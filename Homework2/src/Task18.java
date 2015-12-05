import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter two numbers : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		for (int i = 1; i <= num1; i++) {
			for (int j = 1; j <= num2; j++) {
				System.out.println(i + "*" + j + "= " + (i * j));
			}
		}
		sc.close();
	}

}
