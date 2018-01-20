package Assignment4;

public class SubSum {
	int largest;
	int[] num;
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
		System.out.print(largest);
	}
	/**
	 * handle the logic
	 * For array, sum of subarray between index i and j = sum of subarray between index 0 and j - sum of subarray between index 0 and j.
	 * So we can define sum to sum up the elements, define largest to get the max sum of subarray, define minSum to get the min sum of subarray.
	 * For array{-2,1,-3,4,-1,2,1,-5,4},
	 * sum =0, largest =Integer.MIN_VALUE, minSum=0
	 * sum =-2, largest = -2, minSum = －2
	 * sum = -1, largest = 1, minSum = -2
	 * sum = -4, largest = 1, minSum = -4
	 * sum = 0, largest = 4, minSum = -4
	 * sum = -1, largest = 4, minSum =-4
	 * sum = 1, largest = 5, minSum =-4
	 * sum = 2, largest = 6, minSum =-4
	 * sum = -3, largest = 6, minSum = -4
	 * sum =1, largest = 5,minSum =-4
	 */
	public void logic(){
		largest=Integer.MIN_VALUE;
		int sum=0,minSum=0;
		for(int i=0;i<num.length;i++){
			sum+=num[i];
			largest = Math.max(largest, sum-minSum);
			minSum = Math.min(minSum, sum);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={-2,1,-3,4,-1,2,1,-5,4};
		SubSum s = new SubSum();
		s.input(A);
		s.logic();
		s.output();
	}

}
