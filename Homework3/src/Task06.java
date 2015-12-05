import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		int[] arrayOne, arrayTwo;
		int arrayOneSize, arrayTwoSize;
		boolean areTheSameSize, areTheSame;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the first array : ");
		arrayOneSize = sc.nextInt();

		arrayOne = new int[arrayOneSize];

		for (int index = 0; index < arrayOne.length; index++) {
			System.out.print("Enter arrayOne[" + index + "] : ");
			arrayOne[index] = sc.nextInt();
		}

		System.out.print("Enter the size of the second array : ");
		arrayTwoSize = sc.nextInt();

		arrayTwo = new int[arrayTwoSize];

		for (int index = 0; index < arrayTwo.length; index++) {
			System.out.print("Enter arrayTwo[" + index + "] : ");
			arrayTwo[index] = sc.nextInt();
		}

		areTheSameSize = (arrayOne.length == arrayTwo.length);

		areTheSame = areTheSameSize;
		if (areTheSameSize) {
			for (int index = 0; index < arrayOne.length; index++) {
				if (arrayOne[index] != arrayTwo[index]) {
					areTheSame = false;
				}
			}
		}

		System.out.println("The arrays have the same size is " + areTheSameSize 
				+ ". \nThe arrays are the same is " + areTheSame + ".");
		
		sc.close();
	}

}
