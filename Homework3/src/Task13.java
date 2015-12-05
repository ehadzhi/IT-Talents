import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		int[] array;
		int number,numberCopy,digitsInBinary=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number tobe represented in binary : ");
		number = sc.nextInt();
		
		numberCopy = number;
		while( numberCopy != 0){
			numberCopy>>=1;
			digitsInBinary+=1;
		}
		
		array = new int[digitsInBinary];
		
		for(int index = (array.length-1);index>=0;index--){
			array[index] = (number & 1);
			number>>=1;
		}
		
		for(int index = 0;index<array.length;index++){
			System.out.print(array[index]);
		}
		
		sc.close();
		
	}

}
