import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		int a1, a2, a3, swap;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers");
		a1 = sc.nextInt();
		a2 = sc.nextInt();
		a3 = sc.nextInt();
		
		swap = a1;
		a1 = a2;
		a2 = a3;
		a3 = swap;
		
		sc.close();
		

	}

}
