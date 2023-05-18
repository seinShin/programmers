package programmers_java;
import java.util.*;
public class lv2_7 {
	// toCharArray() Å×½ºÆ®
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr = "asdfg";
		
		for(char i : arr.toCharArray()) {
			System.out.println(i);
		}
		
		char[] arr2 = arr.toCharArray();
		System.out.println(Arrays.toString(arr2));
	}
}
