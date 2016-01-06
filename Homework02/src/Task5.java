import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		int oneNum, secondNum, swap;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter two numbers : ");
		oneNum = sc.nextInt();
		secondNum = sc.nextInt();
		
		if( oneNum > secondNum ) {
			swap = oneNum;
			oneNum = secondNum;
			secondNum = swap;
		}
		
		for(int i = oneNum;i <= secondNum;i++ ) {
			System.out.print(" " + i);
		}
		sc.close();
	}

}
