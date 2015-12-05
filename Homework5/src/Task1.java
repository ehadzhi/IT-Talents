import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		String str1,str2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first string : ");
		str1 = sc.nextLine();
		System.out.println("Enter the second string : ");
		str2 = sc.nextLine();
		
		System.out.println(str1.toUpperCase() + " " + str1.toLowerCase());
		System.out.println(str2.toUpperCase() + " " + str2.toLowerCase());
		
		sc.close();
	}

}
