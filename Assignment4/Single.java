package Assignment4;

public class Single {
	int[] num;
	int result;
	/**
	 * this accept user input
	 * @param A
	 */
	public void input(int[] A){
		num = A;
	}
	/**
	 * show the result to user
	 */
	public void output(){
		System.out.println(result);
	}
	/**
	 * handle the logic
	 * As we all know, for integer n, n^n=0,n^0=n, 0^n=n.
	 * And every element appears twice except for one, so if we just need to make exclusive or operation on the whole array, we can get the single one
	 * for example: {1,1,2,4,2,4,3}
	 * result =0,
	 * result ^1 = 1; result^1 =0; result^2 = 2; result^4 = 6; result^2 = 4; result^4 =0; result ^3 = 3
	 * so single one is 3
	 */
	public void logic(){
		result =0;
		for(int n:num){
			result^=n;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={1,1,2,4,2,4,3};
		Single s = new Single();
		s.input(A);
		s.logic();
		s.output();
	}

}
