import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		byte xOne,yOne,xTwo,yTwo;
		boolean oneIsBlack,twoIsBlack;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the two positions : ");
		
		xOne = sc.nextByte();
		yOne = sc.nextByte();
		
		xTwo = sc.nextByte();
		yTwo = sc.nextByte();
		
		sc.close();
		
		oneIsBlack = ( (xOne + yOne) % 2 != 0);
		twoIsBlack = ( (xTwo + yTwo) % 2 != 0);
		
		if( oneIsBlack ^ twoIsBlack ){
			System.out.println("The positions have different color");
		}
		else{
			System.out.println("The positions have the same color");
		}
		
		

	}

}
