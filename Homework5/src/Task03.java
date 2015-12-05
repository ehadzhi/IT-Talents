import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		String str1, str2;
		int minLength;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first string : ");
		str1 = sc.nextLine();
		System.out.print("Enter the second string : ");
		str2 = sc.nextLine();

		minLength = (str1.length() < str2.length()) ? str1.length() : str2.length();

		for(int index = 0;index < minLength;index++){
			if( str1.charAt(index) != str2.charAt(index) ){
				System.out.println( index + "  " + str1.charAt(index) +"-"+ str2.charAt(index));
			}
		}
		
		sc.close();
	}

}
