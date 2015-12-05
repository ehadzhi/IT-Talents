import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		number = sc.nextInt();
		
		for(int i = 0, k = (number-1);i < number;i++,k+=2) {
			for(int j=0;j<number;j++) {
				System.out.print(k);
			}
			System.out.println();
		}
		sc.close();
	}

}
