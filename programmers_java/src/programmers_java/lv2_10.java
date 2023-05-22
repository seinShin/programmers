package programmers_java;

public class lv2_10 {
	//점프와 순간 이동 - 그리디
	public int solution(int n) {
		int ans = 0;
		while(n>0) {
			if (n%2 == 0) {
				n=n/2;
			}else {
				n-=1;
				ans+=1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lv2_10 test = new lv2_10();
		System.out.println(test.solution(5));
	}

}
