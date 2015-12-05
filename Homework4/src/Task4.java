
public class Task4 {

	public static void main(String[] args) {
		int[][] array2D = {
				{48,72,13,14,15},
				{21,22,53,24,75},
				{31,57,33,34,35},
				{41,95,43,44,45},
				{59,52,53,54,53},
				{61,69,63,64,65}
		};

		for (int col = 0; col < array2D[0].length; col++) {
			for (int row = (array2D.length-1); row >= 0; row--) {
				System.out.print(array2D[row][col]+ " ");
			}
			System.out.println();
		}
		
	}

}
