import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		number = sc.nextInt();

		while (number != 1) {
			if (number % 2 == 0) {
				number /= 2;
			} 
			else {
				number *= 3;
				number++;
			}
			System.out.print(number + " ");
		}
		sc.close();
	}

}
