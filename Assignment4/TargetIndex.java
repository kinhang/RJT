package Assignment4;

public class TargetIndex {
	int start, end,target;
	int[] num;
	/**
	 * this accept user input
	 * @param A,t
	 */
	public void input(int[] A, int t){
		num = A;
		target = t;
	}
	/**
	 * show the result to user
	 */
	public void output(){
		System.out.println(start);
		System.out.println(end);
	}
	/**
	 * handle the logic
	 * Use binary Search to find the first index of target, if we can't find the first index, that means we don't have this target number.
	 * if we do so, then use binary Search to find the second index of target
	 * for example:{5,7,7,8,8,10}, target =8
	 * left =0, right=5, mid=2: num[2] = 7<8, left = 2
	 * left =2, right =5, mid = 3: num[3] =8, right = 3
	 * left =2,right =3: num[2]=7!=8 and num[3]=8, so start = right =3;
	 * left =0, right=5,mid =2: num[2]=7<8,left=2;
	 * left =2, right =5, mid =3: num[3]=8, left =3;
	 * left =3, right =5, mid = 4; num[4]=8,left =4;
	 * left =4, right=5: num[5]=10!=8, num[4] = 8, so end = left = 4
	 * so start = 3, end =4
	 */
	public void logic(){
		int left = 0,right = num.length-1;
		while(left+1<right){
			int mid = left+(right-left)/2;
			if(num[mid]>=target){
				right = mid;
			}
			else{
				left = mid;
			}
		}
		if(num[left]==target){
			start = left;
		}
		else if(num[right]==target){
			start = right;
		}
		else{
			start =-1;
			end =-1;
			return;
		}
		left =0;
		right = num.length-1;
		while(left+1<right){
			int mid = left+(right-left)/2;
			if(num[mid]<=target){
				left = mid;
			}
			else{
				right = mid;
			}
		}
		if(num[right]==target){
			end = right;
		}
		else if(num[left]==target){
			end = left;
		}
		else{
			start =-1;
			end =-1;
			return;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={5,7,7,8,8,10};
		TargetIndex t = new TargetIndex();
		t.input(A, 8);
		t.logic();
		t.output();
	}

}
