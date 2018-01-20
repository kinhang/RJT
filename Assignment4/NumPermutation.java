package Assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumPermutation {
	int[] num;
	List<List<Integer>> result;
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
		for(List<Integer> list:result){
			for(int num:list){
				System.out.print(num+",");
			}
			System.out.println();
		}
	}
	/**
	 * handle the logic
	 * if input A={1,3,2}, then sort A=>{1,2,3}
	 * list: 1 =>1,2; 1,3
	 * 		 1,2=>1,2,3=>result.add({1,2,3})
	 * 		 1,3=>1,3,2=>result.add({1,3,2})
	 * 		 2 => 2,1;2,3
	 * 		 2,1=>2,1,3 =>result.add({2,1,3})
	 * 		 2,3 =>2,3,1=>result.add({2,3,1})
	 * 		 3 => 3,1;3,2
	 * 		 3,1=>3,1,2 => result.add({3,1,2})
	 * 		 3,2 => 3,2,1=> result.add({3,2,1})
	 */
	public void logic(){
		int n = num.length;
		boolean[] visited = new boolean[n];
		result = new ArrayList<>();
		Arrays.sort(num);
		List<Integer> list = new ArrayList<>();
		helper(result,num,list,visited);
	}
	public void helper(List<List<Integer>> result,int[] num,List<Integer> list,boolean[] visited){
		if(list.size()==num.length){
			result.add(new ArrayList<Integer>(list));
			return;
		}
		for(int i=0;i<num.length;i++){
			if(visited[i] || (i>0 && num[i]==num[i-1] && !visited[i-1])){
				continue;
			}
			list.add(num[i]);
			visited[i]=true;
			helper(result,num,list,visited);
			list.remove(list.size()-1);
			visited[i] = false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A ={1,3,2};
		NumPermutation n = new NumPermutation();
		n.input(A);
		n.logic();
		n.output();
	}

}
