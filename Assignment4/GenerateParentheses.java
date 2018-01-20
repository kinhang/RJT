package Assignment4;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
	int num;
	List<String> result;
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
		for(String s:result){
			System.out.println(s);
		}
	}
	/**
	 * handle the logic
	 * if input n is 3, 
	 * then helper(result,"",3,3) => helper(result,"(",2,3);
	 * helper(result,"C",2,3) => helper(result,"((",1,3),helper(result,"()",2,2);
	 * helper(result,"((",1,3) =>helper(result,"(((",0,3),helper(result,"(()",1,2);
	 * helper(result,"(((",0,3) =>helper(result,"((()",0,2) =>helper(result,"((())",0,1) =>helper(result,"((()))",0,0)=> result.add("((()))")
	 * helper(result,"(()",1,2) =>helper(result,"(()(",0,2), helper(result,"(())",1,1);
	 * helper(result,"(()(",0,2) =>helper(result,"(()()",0,1) => helper(result,"(()())",0,0) => result.add("(()())");
	 * helper(result,"(())",1,1) => helper(result,"(())(",0,1) =>helper(result,"(())()",0,0) => result.add("(())()");
	 * helper(result,"()",2,2) => helper(result,"()(",1,2);
	 * helper(result,"()(",1,2)=>helper(result,"()((",0,2), helper(result,"()()",1,1);
	 * helper(result,"()((",0,2) =>helper(result,"()(()",0,1)=>helper(result,"()(())",0,0) => result.add("()(())");
	 * helper(result,"()()",1,1) =>helper(result,"()()(",0,1)=>helper(result,"()()()",0,0)=> result.add("()()()");
	 */
	public void logic(){
		result = new ArrayList<>();
		helper(result,"",num,num);
	}
	public void helper(List<String> result, String s, int left, int right){
		if(left ==0 && right==0){
			result.add(s);
			return;
		}
		if(left!=0){
			helper(result,s+"(",left-1,right);
		}
		if(right!=0 && left<right){
			helper(result,s+")",left,right-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateParentheses g = new GenerateParentheses();
		g.input(3);
		g.logic();
		g.output();
	}

}
