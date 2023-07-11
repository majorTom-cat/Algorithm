package Lv0;

import java.util.Arrays;

public class Lv0_35 {

	public static void main(String[] args) {
		
		int[][] fasd = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
		
		solution(fasd);

	}
	
	 public static int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        
        Arrays.sort(answer);
        
        Double[] avg = null;
        
        avg = new Double[score.length];
        
        for(int i = 0; i < score.length; i++) {
        	int sum = score[i][0] + score[i][1];
        	Double tempAvg = (double) (sum / 2);
        	avg[i] = tempAvg; 
        	System.out.println(avg[i]);
        }
        
        Double max = 0.0;
        int maxIndex = 0;
        int rank = 1;
        for(int i = 0; i < score.length; i++) {
        	
        	for(int j = 0; j < score.length; j++) { // 최대값 찾기
        		if(max < avg[j]) {
            		max = avg[j];
            		maxIndex = j;
            	}
        	}
        	
        	answer[maxIndex] = rank;
        	
        	for(int k = 0; k < score.length; k++) {
        		if(max == avg[k]) {
        			rank++;
        		}
        	}
        	
        }
        
        //System.out.println(answer[0]);
        
        return answer;
	    }

}
