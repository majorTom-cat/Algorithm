package Lv0;

public class Lv0_35 {

	public static void main(String[] args) {
		
		//int[][] fasd = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
		//int[][] fasd = {{0, 0}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {0, 0}};
		int[][] fasd = {{1, 3}, {3, 1}, {2, 3}, {3, 2}, {1, 2}, {0, 0}};
		
		solution(fasd);

	}
	
	 public static int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        
        double[] avg = new double[score.length];
        
        for(int i = 0; i < score.length; i++) {
        	double sum = score[i][0] + score[i][1];
        	double tempAvg = sum / 2;
        	avg[i] = tempAvg;
        }
        
        double max = -0.5;
        int maxIndex = 0;
        int rank = 1;
        int jointRank = 1;
        for(int i = 0; i < score.length; i++) {
        	
        	for(int j = 0; j < score.length; j++) { // 최대값 찾기
        		if(max < avg[j]) {
            		max = avg[j];
            		maxIndex = j;
            	}
        	}
        	
        	answer[maxIndex] = rank;
        	avg[maxIndex] = -1.0;
        	
        	for(int k = 0; k < score.length; k++) { // 공동 순위 찾기
        		
        		if(k == maxIndex) {
        			System.out.println("max : " + max + "    avg[k] : " + avg[k] + "    <------ 현재");
        			continue;
        		} else {
        			System.out.println("max : " + max + "    avg[k] : " + avg[k]);
        			if(max == avg[k]) {
            			System.out.println("공동 순위 찾음. jointRank : " + jointRank);
            			answer[k] = rank;
            			avg[k] = -1.0;
            			jointRank++;
            			i++;
            		}
        		}
        		
        	}
        	System.out.println();

        	max = -0.5;
        	rank += jointRank;
        	jointRank = 1;
        	
        	for(int l = 0; l < score.length; l++) {
        		System.out.print(answer[l] + "  ");
        	}
        	System.out.println();
        }

        return answer;
	    }

}
