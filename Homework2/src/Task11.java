import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		int height;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the height of the triangle : ");
		height = sc.nextInt();

		// filled
		for (int i = 1; i <= height; i++) {
			for (int k = i; k < height; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= ((i * 2) - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

		// unfilled
		for (int i = 0; i < height; i++) {
			for (int j = 1; j < (2 * height); j++) {
				if ( j == (height - i ) || j == (height + i)
						|| i == (height - 1)){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}