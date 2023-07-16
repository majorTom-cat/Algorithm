package Lv0;

import java.util.Arrays;

public class Lv0_36 {

	public static void main(String[] args) {
		int[] numlist = {5, 2, 3, 8, 5, 6};
		int n = 4;
		
		solution(numlist, n);
	}

	
	public static int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        
        for(int i = 0; i < answer.length; i++) {
        	int temp = Math.abs(n - numlist[i]);
        	answer[i] = temp; 
        }
        
        Arrays.sort(numlist);
        
        for (int i = 0; i < numlist.length; i++) {
        	System.out.println(numlist[i]);
        }
        
        return answer;
    }
}
