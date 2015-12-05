import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		int number;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		number = sc.nextInt();

		for (int i = 0, j = 3; i <= number; i++, j += 3) {
			if ( i != 0) {
				System.out.print(",");
			}
			System.out.print(j);
		}
		sc.close();
	}

}
