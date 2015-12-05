import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		int firstInt, secondInt;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first and the second integers : ");
		firstInt = sc.nextInt();
		secondInt = sc.nextInt();
		
		System.out.print("The two integers in ascending order : ");
		
		if( firstInt <= secondInt) {
			System.out.println(firstInt + " " + secondInt);
		}
		else {
			System.out.println(secondInt + " " + firstInt);
		}
		
		sc.close();

	}

}
