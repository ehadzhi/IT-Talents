import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		String str1, str2, swapstr;
		int maxLength;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first string : ");
		str1 = sc.nextLine();
		System.out.println("Enter the second string : ");
		str2 = sc.nextLine();

		swapstr = str1.substring(0,5);
		str1 = str2.substring(0, 5) + str1.substring(5);
		str2 = swapstr + str2.substring(5);
		
		maxLength = (str1.length() > str2.length()) ? str1.length() : str2.length();
		str1 = (str1.length() > str2.length()) ? str1 : str2;
	
		System.out.println(str1 + " " + maxLength);
		
		sc.close();
	}

}
