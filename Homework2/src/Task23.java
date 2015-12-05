
public class Task23 {

	public static void main(String[] args) {
		int i = 1, j = 1;
		while (i <= 9) {
			j = i;
			while (j <= 9) {
				System.out.print(i + "*" + j + "; ");
				j++;
			}
			i++;
			System.out.println();
		}

	}

}
