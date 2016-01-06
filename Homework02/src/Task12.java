
public class Task12 {

	public static void main(String[] args) {
		int digit1, digit2, digit3;
		for (int i = 100; i < 1000; i++) {
			digit1 = i % 10;
			digit2 = (i / 10) % 10;
			digit3 = (i / 100) % 100;
			if (digit1 != digit2 && digit2 != digit3 && digit3 != digit1) {
				System.out.print(i + " ");
			}
		}

	}

}
