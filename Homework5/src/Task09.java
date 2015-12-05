import java.util.Scanner;

public class Task09 {

	static boolean isDigit(char ch) {
		if (ch >= '0' && ch <= '9') {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String str;
		int currentNum = 0, sum = 0, currentFactor = 1;
		boolean readingNum = false;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string : ");
		str = sc.nextLine();
		str = " " + str;

		for (int index = (str.length() - 1); index >= 0; index--) {
			if (readingNum) {
				if (isDigit(str.charAt(index))) {
					currentNum += (currentFactor * (int) (str.charAt(index) - '0'));
					currentFactor *= 10;
				} 
				else {
					if (str.charAt(index) == '-') {
						currentNum *= -1;
					}
					System.out.println(currentNum);
					sum += currentNum;
					readingNum = false;
				}
			} 
			else {
				if (isDigit(str.charAt(index))) {
					readingNum = true;
					currentNum = (int) (str.charAt(index) - '0');
					currentFactor = 10;
				} else {
					continue;
				}
			}
		}
		System.out.println("The sum is : " + sum);
		
		sc.close();
	}
}