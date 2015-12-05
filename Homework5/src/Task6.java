import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		String sentence;
		StringBuilder builder = new StringBuilder();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a sentence : ");
		sentence = sc.nextLine();
		
		sentence = (" " + sentence);
		for(int index = 1;index < sentence.length();index++){
			if( sentence.charAt(index - 1) == ' ' && sentence.charAt(index) != ' '){
				builder.append( ((sentence.toUpperCase()).charAt(index)) );
			}
			else{
				builder.append(sentence.charAt(index));
			}
		}
		sentence = builder.toString();
		System.out.println(sentence);
		
		sc.close();
	}

}
