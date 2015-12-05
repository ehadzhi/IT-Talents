import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		int hour;
		float sumOfMoney;
		boolean amIHealthy;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter hour : ");
		hour = sc.nextInt();
		System.out.print("Enter the amount of money that you have : ");
		sumOfMoney = sc.nextFloat();
		System.out.print("Are you healthy ? : ");
		amIHealthy = sc.nextBoolean();
		
		if( amIHealthy ) {
			System.out.print("I will go to the movies with friends");
		}
		else
			System.out.print("I wont get out");
		if( sumOfMoney > 0) {
			System.out.print(" and buy myself medicine");
		}
		else {
			System.out.print(" and stay at home and drink tea");
		}
		if( sumOfMoney < 10) {
			System.out.print(" and I will go for a cofee");
		}
	
		sc.close();
	}

}
