package programmers_java;

public class lv2_6 {
	//JadenCase ¹®ÀÚ¿­
	public String solution(String s) {
        String answer = "";
        String[] arr = s.toLowerCase().split("");
        boolean isTrue = true;
        
        for(String i: arr){
            answer += isTrue? i.toUpperCase() : i;
            isTrue = i.equals(" ") ? true : false;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		lv2_6 test = new lv2_6();
		System.out.println(test.solution("for the last week"));
	}
}
