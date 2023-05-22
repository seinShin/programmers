package programmers_java;
import java.util.Arrays;
import java.util.HashSet;
//영어 끝말잇기 - HashSet 사용
public class lv2_11 {
	public int[] solution(int n, String[] words) {
		int[] answer = new int[2];
		HashSet<String> set = new HashSet<String>();
		String prev="";
		set.add(words[0]);
		
		for(int i =1 ; i< words.length;i++) {
			prev = words[i-1];
			if(set.contains(words[i]) || prev.charAt(prev.length()-1) != words[i].charAt(0)) {
				answer[0] = i%n+1;
				answer[1]= i/n+1;
				break;
			}
			set.add(words[i]);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lv2_11 test = new lv2_11();
		String [] arr = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		System.out.println(Arrays.toString(test.solution(3, arr)));
	}

}
