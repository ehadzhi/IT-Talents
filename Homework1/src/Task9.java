import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		int a1,a2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter two natural numbers : ");
		a1 = sc.nextInt();
		a2 = sc.nextInt();
		
		System.out.print( (a1*a2)%10 );
		
		if( ((a1*a2)%10)%2 == 0 )
			System.out.println(" even");
		else
			System.out.println(" uneven");
		
		sc.close();
	}

}
