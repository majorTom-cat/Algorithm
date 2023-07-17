package Lv0;

import java.util.Arrays;

public class Lv0_36 {

	public static void main(String[] args) {
		int[] numlist = {600, 400, 300, 200, 700, 800, 100, 900};
		int n = 500;
		
		solution(numlist, n);
	}

	
	public static int[] solution(int[] numlist, int n) {
		int[] tempNumlist = new int[numlist.length];
		for(int i = 0; i < numlist.length; i++) {
			tempNumlist[i] = numlist[i]; 
		}

		Arrays.sort(tempNumlist);
		
        int[] answer = new int[numlist.length];
        int[] tempArray = new int[numlist.length];
        
        for(int i = 0; i < answer.length; i++) {
        	int temp = Math.abs(n - numlist[i]);
        	
        	tempArray[i] = temp; 
        }
        
        Arrays.sort(tempArray);
        
        for(int i = 0; i < answer.length; i++) {
        	
        	for(int j = answer.length - 1; j >= 0; j--) {
        		if(tempNumlist[j] >= 0 && Math.abs(n - tempNumlist[j]) == tempArray[i]) {
        			System.out.print("500 - " + tempNumlist[j] + " == " + tempArray[i] + ",    ");
            		answer[i] = tempNumlist[j];
            		System.out.println("answer[" + i + "] = " + numlist[j]);
            		tempNumlist[j] = -1;
            		break;
            	}
        	}
        	
        }
        
        for (int i = 0; i < numlist.length; i++) {
        	System.out.println(answer[i]);
        }
        
        return answer;
    }

}
