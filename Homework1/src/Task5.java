import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		int firstInt, secondInt, thirdInt;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter three integers : ");
		firstInt = sc.nextInt();
		secondInt = sc.nextInt();
		thirdInt = sc.nextInt();
		
		sc.close();
		
		System.out.print("The numbers in descending order :");
		
		if( (firstInt >= secondInt) && (secondInt >= thirdInt) )
			System.out.println(firstInt +" "+ secondInt +" "+ thirdInt);
		
		else if( (secondInt >= thirdInt) && (thirdInt >= firstInt) )
			System.out.println(secondInt +" "+ thirdInt +" "+ firstInt);
		
		else if( (thirdInt >= firstInt) && (firstInt >= secondInt) )
			System.out.println(thirdInt +" "+ firstInt +" "+ secondInt);
		
		else if( (thirdInt >= secondInt) && (secondInt >= firstInt) )
			System.out.println(thirdInt +" "+ secondInt +" "+ firstInt);
		
		else if( (secondInt >= firstInt) && (firstInt >= thirdInt) )
			System.out.println(secondInt +" "+ firstInt +" "+ thirdInt);
		
		else if( (firstInt >= thirdInt) && (thirdInt >= secondInt) )
			System.out.println(firstInt +" "+ thirdInt +" "+ secondInt);
		

	}

}
