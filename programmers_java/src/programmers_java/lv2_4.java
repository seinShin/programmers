package programmers_java;

public class lv2_4 {
	// 피보나치 수 - 동적 계획법
	
	public int solution(int n) {
        int[] fibList = new int[n];
        fibList[0] = 1;
        fibList[1] = 1;
        
        if(n == 1 || n == 2){
            return 1;
        }
        
        for(int i = 2; i< n;i++){
            fibList[i] = (fibList[i-1]+fibList[i-2]) % 1234567;
        }
        
        return fibList[n-1];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lv2_4 test = new lv2_4();
		System.out.println(test.solution(5));
	}

}
