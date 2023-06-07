package programmers_java;
import java.util.*;
//ÇÁ·Î±×·¡¸Ó½º - Èü - ´õ ¸Ê°Ô
public class lv2_13 {
	public int solution(int[] scoville, int k) {
		PriorityQueue<Integer> q = new PriorityQueue<>();
		
		for(int i : scoville) {
			q.add(i);
		}
		
		int answer=0;
		while(q.peek()<k) {
			if (q.size() == 0) {
				return -1;
			}
			
			int x = q.poll();
			int y = q.poll();
			
			int mix = x + (y*2);
			q.add(mix);
			answer+=1;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lv2_13 test = new lv2_13();
		int[] testArray = {1, 2, 3, 9, 10, 12}; 
		System.out.println(test.solution(testArray, 7));
	}

}
