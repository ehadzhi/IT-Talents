import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		number = sc.nextInt();

		number /= 7;
		number *= 7;
		while (number > 0) {
			System.out.println(number + " ");
			number -= 7;
		}
		sc.close();
	}

}
