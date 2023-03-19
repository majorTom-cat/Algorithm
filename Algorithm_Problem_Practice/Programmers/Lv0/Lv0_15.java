package Lv0;

import java.util.ArrayList;
import java.util.Arrays;

public class Lv0_15 {

	public static void main(String[] args) {
		System.out.println(solution(29183, 1));

	}
	
	static  public int solution(int num, int k) {
        int answer = -1;
        String numString = Integer.toString(num);
        String[] numStringsArr = numString.split("");
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(numStringsArr));
        
        int temp = -1;
        temp = arr.indexOf((String) Integer.toString(k)); 
			
        if(temp != -1) {
        	answer = temp + 1;
        }
		
        
        return answer;
    }
	
}
