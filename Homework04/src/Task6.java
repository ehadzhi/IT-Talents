
public class Task6 {

	public static void main(String[] args) {
		int[][] array2D = {
				{11,12,13,14,15,16},
				{21,22,23,24,25,26},
				{31,32,33,34,35,36},
				{41,42,43,44,45,46},
				{51,52,53,54,55,56},
				{61,62,63,64,65,66}
		};
		
		int currentRowSum = 0,evenRowsSum = 0;
		
		for(int row = 1;row<array2D.length;row+=2){
			currentRowSum = 0;
			for(int col = 0;col<array2D[row].length;col++){
				currentRowSum+= array2D[row][col];
				System.out.print(array2D[row][col] + " ");
			}
			System.out.println("sum = "+ currentRowSum);
			evenRowsSum+=currentRowSum;
		}
		System.out.println("The sum of th even rows is sum = " + evenRowsSum);
	}

}
