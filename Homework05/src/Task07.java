import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		String words;
		int numberOfWords = 0, maxWordLength = 0, currentWordLength = 0;
		boolean countingWord = false;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter words using space as delimiter : ");
		words = sc.nextLine();

		for (int index = 0; index < words.length(); index++) {
			if (!countingWord) {
				if (words.charAt(index) != ' ') {
					countingWord = true;
					currentWordLength = 1;
					numberOfWords++;
				}
			} else {
				if (words.charAt(index) != ' ') {
					currentWordLength++;
					if (maxWordLength < currentWordLength) {
						maxWordLength = currentWordLength;
					}
				} else {
					countingWord = false;
					currentWordLength = 0;
				}
			}
		}
		
		System.out.println(numberOfWords + " words, the longest has " + maxWordLength + " characters.");

		sc.close();
	}

}
