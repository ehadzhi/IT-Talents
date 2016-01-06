import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		int startNumber = 1, endNumber, swap, sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		endNumber = sc.nextInt();
		
		if( startNumber > endNumber ) {
			swap = startNumber;
			startNumber = endNumber;
			endNumber = swap;
		}
		
		for(int i = startNumber;i <= endNumber;i++ ){
			sum += i;
		}
		
		System.out.println("The sum is : " + sum);
		
		sc.close();
	}

}
