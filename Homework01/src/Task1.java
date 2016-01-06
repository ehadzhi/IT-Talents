import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		double firstNum, secondNum, thirdNum;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number :");
		firstNum = sc.nextDouble();
		System.out.print("Enter the second number :  ");
		secondNum = sc.nextDouble();
		
		System.out.print("Enter the third number : ");
		thirdNum = sc.nextDouble();
		
		if((firstNum < secondNum) && (thirdNum > firstNum) && (thirdNum < secondNum)
		|| (firstNum > secondNum) && (thirdNum < firstNum) && (thirdNum > secondNum)){
			System.out.println( thirdNum + " is between " + firstNum + " and " + secondNum);
		}
		else {
			System.out.println( thirdNum + " is not between " + firstNum + " and " + secondNum);
		}
		
		sc.close();

	}
}

