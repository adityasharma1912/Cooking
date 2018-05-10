public class GOTMatrix{

	private static void print(String str){
		System.out.println(str);
	}

	private static void killMatrix(int matrix[][],int row, int column){
		int rows = matrix.length;
		int columns = matrix[0].length;

		matrix[row][column] = 0; //flip the bit... so that It should not count again.

		if((row+1) < rows && matrix[row+1][column] == 1)
			killMatrix(matrix,row+1,column);

		if((row-1) > -1 && matrix[row-1][column] == 1)
			killMatrix(matrix,row-1,column);

		if((column+1) < columns && matrix[row][column+1] == 1)
			killMatrix(matrix,row,column+1);

		if((column-1) > -1 && matrix[row][column-1] == 1)
			killMatrix(matrix,row,column-1);

		if((column+1) < columns && (row+1) < rows && matrix[row+1][column+1] == 1)
			killMatrix(matrix,row+1,column+1);

		if((column-1) > -1 && (row+1) < rows && matrix[row+1][column-1] == 1)
			killMatrix(matrix,row+1,column-1);

		if((column+1) < columns && (row-1) > -1 && matrix[row-1][column+1] == 1)
			killMatrix(matrix,row-1,column+1);

		if((column-1) < -1 && (row-1) < -1 && matrix[row-1][column-1] == 1)
			killMatrix(matrix,row-1,column-1);

	}

	private static int groupCount(int matrix[][]){
		if(matrix.length == 0)
			return 0;

		int count = 0;
		int columns = matrix[0].length;
		int rows = matrix.length;

		for(int row = 0; row < rows; row++){
			for(int column = 0;column < columns; column++){
				if(matrix[row][column] == 1){
					count++;
					killMatrix(matrix,row,column);
				}
			}
		}

		return count;
	}

	public static void main(String args[]){

		//matrix with 3 colums and 6 rows...
		int[][] matrix = {
			{1,0,0,1,0,1},
			{0,0,1,0,1,0},
			{1,0,0,0,1,0}
		};

		//matrix with 10 colums and 7 rows...
		int[][] matrix2 = {
			{0,0,0,0,0,0,1,1,1,0},
			{0,0,0,0,0,0,0,0,0,0},
			{1,0,0,0,0,1,0,0,0,0},
			{1,0,0,0,0,0,0,1,1,0},
			{1,0,0,0,0,0,0,1,1,0},
			{1,0,0,0,1,0,0,0,0,0},
			{0,0,0,1,0,0,0,0,0,1}
		};

		print("Number of groups = "+groupCount(matrix));
		print("Number of groups = "+groupCount(matrix2));

	}
}
