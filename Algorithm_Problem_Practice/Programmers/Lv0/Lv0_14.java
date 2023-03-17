package Lv0;

import java.util.Arrays;

public class Lv0_14 {

	public static void main(String[] args) {
		int arr[] = {4, 5, 6, 7, 8, 9, 10, 11, 12};
		
		solution(3, arr);

	}

	static public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        int numlistLength = numlist.length;
        int cnt = 0;

        int[] tempArray = new int[numlistLength];
        
        for(int i = 0; i < numlistLength; i++) {
        	if(numlist[i]%n == 0) {
        		
        		tempArray[cnt] = numlist[i];
        		cnt++;
        	}
        }
        answer = Arrays.copyOf(tempArray, cnt);
        //answer = Arrays.copyOfRange(tempArray, 0, cnt);

        System.out.println(Arrays.toString(answer));
        
        return answer;
    }
	
}
