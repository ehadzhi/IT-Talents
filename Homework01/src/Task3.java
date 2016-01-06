import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		int firstInt, secondInt, swap;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first and the second numbers : ");
		firstInt = sc.nextInt();
		secondInt = sc.nextInt();
		
		swap = firstInt;
		firstInt = secondInt;
		secondInt = swap;
		
		System.out.println("The swapped values of the first = "
		+ firstInt + " and the second = " + secondInt);
		
		sc.close();

	}

}
