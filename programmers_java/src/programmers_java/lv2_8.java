package programmers_java;

public class lv2_8 {
	// 유클리드 호제 - n개의 최소공배수
	 public int solution(int[] num) {
	        int answer = num[0];
	        
	        for(int i=0;i<num.length;i++){
	            answer = answer*num[i] /gcd(answer,num[i]);  
	        }
	        return answer;
	    }

    public int gcd(int a, int b) {
        return (a % b == 0) ? b : gcd(b, a % b);
    }

    public static void main(String[] args) {
        lv2_8 c = new lv2_8();
        int[] ex = { 1, 3, 5, 34 };
        System.out.println(c.solution(ex));
    }

}
