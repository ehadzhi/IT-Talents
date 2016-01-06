import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {
		int number, numberFact = 1, clone;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		number = sc.nextInt();

		clone = number;
		do {
			numberFact *= clone;
			clone--;
		} while (clone != 1);

		System.out.println(number + "! = " + numberFact);
		sc.close();
	}

}
