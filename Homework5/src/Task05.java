import java.util.Scanner;

public class Task05 {
	
	// Prints str1 crossed with str2 on positions index1 and index2 (str2 is vertical)
	static void printCrossed(String str1,int index1,String str2,int index2){
		for (int i = 0; i < str2.length(); i++) {
			if ( i == index2) {
				System.out.println(str1);
			} else {
				for (int j = 0; j < index1; j++) {
					System.out.print(" ");
				}
				System.out.println(str2.charAt(i));
			}
		}
	}

	public static void main(String[] args) {
		String str1, str2;
		boolean noCommonChar = true;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first string : ");
		str1 = sc.nextLine();
		System.out.print("Enter the second string : ");
		str2 = sc.nextLine();

		for (int index1 = 0; index1 < str1.length(); index1++) {
			for (int index2 = 0; index2 < str2.length(); index2++) {
				if (str1.charAt(index1) == str2.charAt(index2)) {
					noCommonChar = false;
					printCrossed(str1,index1,str2,index2);
					System.out.println();
				}
			}
		}
		
		if( noCommonChar ){
			System.out.println("The strings don't have common characters.");
		}
		
		sc.close();

	}

}
