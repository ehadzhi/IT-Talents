import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		String str;
		boolean strIsPalindrome = true;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string : ");
		str = sc.nextLine();
		
		for(int index = 0;index<(str.length()/2);index++){
			if( str.charAt(index) != str.charAt( str.length() - 1 - index)){
				strIsPalindrome = false;
			}
		}
		
		System.out.println("Is palindrome is " + strIsPalindrome);
		
		sc.close();
	}

}
