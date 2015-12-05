import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {
		int number,index = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a natural number : ");
		number = sc.nextInt();
		
		while(index <= 10){
			if(number % 2 == 0 || number%3==0 || number%5==0){
				System.out.print(index + ":" + number + ", ");
				index++;
			}
			number++;
		}
		sc.close();
	}

}
