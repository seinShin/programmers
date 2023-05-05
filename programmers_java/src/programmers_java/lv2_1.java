package programmers_java;

public class lv2_1 {
	// 땅따먹기
	int solution(int[][] land) {
	        int answer = 0;
	        for(int i=1;i<land.length;i++){
	            land[i][0] += Math.max(land[i-1][1], Math.max(land[i-1][2], land[i-1][3]));
	            land[i][1] += Math.max(land[i-1][0], Math.max(land[i-1][2], land[i-1][3]));
	            land[i][2] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][3]));
	            land[i][3] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][2]));
	        }
	        
	        for(int i=0; i<4; i++){
	            answer = Math.max(answer, land[land.length-1][i]);
	        }
	        return answer;
	    }
	 	
	 public static void main(String[] args) {
		 	lv2_1 c = new lv2_1();
	        int[][] test = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };
	        //아래는 테스트로 출력해 보기 위한 코드입니다.
	        System.out.println(c.solution(test));
	    }
}
