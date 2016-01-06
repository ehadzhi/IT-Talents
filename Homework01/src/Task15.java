import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		byte hour;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an hour in 24hr format : ");
		hour = sc.nextByte();
		
		sc.close();
		
		if( hour >= 18 || hour <=4 ){
			System.out.println("Good nigth");
		}
		else if( hour >= 4 && hour <= 9){
			System.out.println("Good morning");
		}
		else if( hour >= 9 && hour <= 18){
			System.out.println("Good day");
		}
	}
}
