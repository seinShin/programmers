package programmers_java;
import java.util.*;
public class lv2_5 {
	//하노이 탑
	ArrayList<int[]> list;
	

	public void hanoi(int n, int rod1, int rod3, int rod2) {
		int [] move = {rod1, rod3};
		
		if (n==1) list.add(move);
		else {
			hanoi(n-1,rod1, rod2, rod3);
			list.add(move);
			hanoi(n-1,rod2,rod3,rod1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lv2_5 test = new lv2_5();
	}
}
