package programmers_java;

public class lv2_12 {
	//n진수 게임 [2018 카카오 블라인드 3차]
	
	public String Solution(int n , int t, int m, int p) {
		StringBuilder convert = new StringBuilder();
		StringBuilder answer = new StringBuilder();
		
		for(int i=0; convert.length() < m*t ; i++) {
			convert.append(Integer.toString(i,n));
		}
		
		for(int i = p-1 ; answer.length() < t; i+=m) {
			answer.append(convert.charAt(i));
		}
			
		System.out.println(answer.toString());
		return answer.toString().toUpperCase();
		
	}
	
	public static void main(String[] args) {
		lv2_12 test = new lv2_12();
		System.out.println(test.Solution(16, 16, 2, 1));
	}
}
