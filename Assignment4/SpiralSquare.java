package Assignment4;

public class SpiralSquare {
	int num;
	int[][] matrix;
	/**
	 * this accept user input
	 * @param n
	 */
	public void input(int n){
		num = n;
	}
	/**
	 * show the result to user
	 */
	public void output(){
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix.length;j++){
				System.out.print(matrix[i][j]+",");
			}
			System.out.println();
		}
	}
	/**
	 * handle the logic
	 * input : n=3;
	 * matrix: 0,0,0    1,0,0    1,2,0    1,2,3    1,2,3    1,2,3    1,2,3    1,2,3    1,2,3    1,2,3
	 *         0,0,0 => 0,0,0 => 0,0,0 => 0,0,0 => 0,0,4 => 0,0,4 => 0,0,4 => 0,0,4 => 8,0,4 => 8,9,4
	 *         0,0,0    0,0,0    0,0,0    0,0,0    0,0,0    0,0,5    0,6,5    7,6,5    7,6,5    7,6,5
	 */
	public void logic(){
		matrix = new int[num][num];
		int row_start = 0,row_end=num-1;
		int col_start = 0, col_end = num-1;
		int item =1;
		while(row_start<=row_end && col_start<=col_end){
			for(int j=col_start;j<=col_end;j++){
				matrix[row_start][j] = item++;
			}
			row_start++;
			for(int i=row_start;i<=row_end;i++){
				matrix[i][col_end] = item++;
			}
			col_end--;
			if(row_start<=row_end && col_start<=col_end){
				for(int j=col_end;j>=col_start;j--){
					matrix[row_end][j] = item++;
				}
				row_end--;
				for(int i=row_end;i>=row_start;i--){
					matrix[i][col_start] = item++;
				}
				col_start++;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		SpiralSquare s = new SpiralSquare();
		s.input(n);
		s.logic();
		s.output();
	}

}
