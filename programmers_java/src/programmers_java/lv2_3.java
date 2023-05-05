package programmers_java;

import java.util.Arrays;
//import java.util.Collections;

public class lv2_3 {
	  // 최솟값 만들기
	  public int solution(int []A, int []B)
	    {
	        int answer = 0;
	       
	        Arrays.sort(A);
	        // Integer[] B = Arrays.stream(B).boxed().toArray(Integer[]::new);
	        // Arrays.sort(B, Collections.reverseOder());
	        Arrays.sort(B);
	        
	        for(int i=0;i<A.length;i++){
	            answer += A[i] * B[B.length-i-1];  
	        }

	        return answer;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lv2_3 test = new lv2_3();
		int []A = {1,4,2};
		int []B = {5,4,4};
		System.out.println(test.solution(A,B));
	}

}
