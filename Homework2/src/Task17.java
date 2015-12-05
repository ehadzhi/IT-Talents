import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		int sideLen;
		char fillerCh;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the lenght of the side and the filler charracter : ");
		sideLen = sc.nextInt();
		fillerCh = sc.next().charAt(0);
		for (int i = 1; i <= sideLen; i++) {
			for (int j = 1; j <= sideLen; j++) {
				if (i == 1 || i == sideLen || j == 1 || j == sideLen) {
					System.out.print("*");
				} else {
					System.out.print(fillerCh);
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
