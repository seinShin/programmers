package programmers_java;

public class lv2_2 {
		//숫자의 표현
	    public int solution(int n) {
	        int answer=1;
	        int sum=0;
	        for(int i=1;i<n+1;i++){
	            sum = i;
	            for(int j=i;j<n-1;j++){
	                sum += j+1;
	                if(sum > n){
	                    break;
	                }
	                if(sum == n){
	                    answer +=1;
	                    break;
	                }
	            }
	        }
	        return answer;
	    }
	    
	    public static void main(String args[]) {
	    	lv2_2 test = new lv2_2();
	    	System.out.println(test.solution(15));
	    	
	    }
}
