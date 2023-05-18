package programmers_java;
import java.util.Stack;
public class lv2_9 {
	//짝지어 제거하기
	public int solution(String s){
        Stack<Character> stack = new Stack<>();
        
        for(char i : s.toCharArray()){
            if (stack.empty()){
                stack.push(i);
            }else{
                if (stack.peek() == i){
                    stack.pop();
                }else{
                    stack.push(i);
                }
            }
        } 
        
        if (stack.empty()){
            return 1;
        }else{
            return 0;
        }
	  }
	
	public static void main(String[] args) {
		lv2_9 test = new lv2_9();
		System.out.println(test.solution("abb"));
	}
}
