import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		int cardIndex, cardNumber, cardColor;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter card's index : ");
		cardIndex = sc.nextInt();

		for (int i = cardIndex; i <= 51; i++) {
			cardNumber = (i / 4);
			cardColor = i % 4;

			switch (cardNumber) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
				System.out.print((cardNumber + 2) );
				break;
			case 9:
				System.out.print(" Jack");
				break;
			case 10:
				System.out.print(" Queen");
				break;
			case 11:
				System.out.print(" King");
				break;
			case 12:
				System.out.print(" Ace");
				break;
			default:
				System.out.print(" No such card");
				break;
			}

			switch (cardColor) {
			case 0:
				System.out.print(" of clubs, ");
				break;
			case 1:
				System.out.print(" of diamonds, ");
				break;
			case 2:
				System.out.print(" of hearts, ");
				break;
			case 3:
				System.out.print(" of spades, ");
				break;
			default:
				System.out.print(" No such card ");
				break;
			}
		}
		sc.close();

	}

}
