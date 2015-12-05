
public class Task1 {

	public static void main(String[] args) {
		int[][] array2D = {
				{48,72,13,14,15},
				{21,22,53,24,75},
				{31,57,33,34,35},
				{41,95,43,44,45},
				{59,52,53,54,55},
				{61,69,63,64,65}
		};
		int max = array2D[0][0],min = array2D[0][0];
		
		for(int row = 0;row<array2D.length;row++){
			for(int col = 0;col<array2D[row].length;col++){
				if( max < array2D[row][col]){
					max = array2D[row][col];
				}
				if( min > array2D[row][col]){
					min = array2D[row][col];
				}
			}
		}
		
		System.out.println("Max = "+ max +", min = "+min);

	}

}
