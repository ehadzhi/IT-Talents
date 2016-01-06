import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		String str;
		StringBuilder builder = new StringBuilder();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string : ");
		str = sc.nextLine();
		
		for(int index = 0;index < str.length();index++){
			builder.append( (char)(str.charAt(index) + 5) );
		}
		
		str = builder.toString();
		
		System.out.println(str);
		
		sc.close();
		
	}

}
