package Assignment4;

import java.util.ArrayList;
import java.util.List;

public class PartitionString {
	String s;
	ArrayList<List<String>> partition;
	/**
	 * this accept user input
	 * @param source
	 */
	public void input(String source){
		s = source;
	}
	/**
	 * show the result to user
	 */
	public void output(){
		for(List<String> list:partition){
			for(String k:list){
				System.out.print(k+",");
			}
			System.out.println();
		}
	}
	/**
	 * handle the logic
	 * if input is "aab",
	 * list: a => a,a => a,a,b; partition.add({"a","a","b"})
	 * 		 aa => aa,b ; partition.add({"aa","b"})
	 * 		 aab not palindrome;
	 * partition: "a","a","b";"aa","b"
	 * 
	 */
	public void logic(){
		partition = new ArrayList<>();
		ArrayList<String> list = new ArrayList<>();
		helper(s,list,partition,0);
	}
	public void helper(String s,ArrayList<String> list,ArrayList<List<String>> partition,int start){
		if(start==s.length()){
			partition.add(new ArrayList<String>(list));
			return;
		}
		for(int i=start+1;i<=s.length();i++){
			String k = s.substring(start,i);
			if(checkPalindrome(k)){
				list.add(k);
				helper(s,list,partition,i);
				list.remove(list.size()-1);
			}
		}
	}
	public boolean checkPalindrome(String s){
		char[] c = s.toCharArray();
		int left =0, right = c.length-1;
		while(left<right){
			if(c[left]!=c[right]){
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aab";
		PartitionString p = new PartitionString();
		p.input(s);
		p.logic();
		p.output();
	}

}
