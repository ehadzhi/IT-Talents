import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		int numOfLitres, twoLitreBuckets, threeLitreBuckets = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter many litres is your water tank : ");
		numOfLitres = sc.nextInt();
		
		twoLitreBuckets = numOfLitres/2;
		if( (numOfLitres % 2) != 0){
			twoLitreBuckets--;
			threeLitreBuckets = 1;
		}
		
		System.out.print("Your tank can be filled with " + twoLitreBuckets +
				" 2 litre buckets");
		if( threeLitreBuckets != 0)
			System.out.println(" and " + threeLitreBuckets + " 3 litre bucket");
		
		sc.close();
	}

}
