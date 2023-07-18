package Lv0;

import java.util.ArrayList;

public class Lv0_37 {

	public static void main(String[] args) {


		solution(27, 27);

	}
	
	public static int solution(int a, int b) {
        int answer = 0;
        ArrayList<Integer> tempArrayListA = new ArrayList<>();
        ArrayList<Integer> tempArrayListB = new ArrayList<>();
        
        int tempA = a;
        int tempB = b;
        
        
        while (true) {
        	if(tempA == 1) {
        		break;
        	}
        	
        	for(int i = 2; i <= tempA; i++) {
            	if(tempA % i == 0) {
            		tempArrayListA.add(i);
            		System.out.println(i);
            		tempA /= i;
            		break;
            	}
            }
		}
        
        System.out.println();
        while (true) {
        	if(tempB == 1) {
        		break;
        	}
        	
        	for(int i = 2; i <= tempB; i++) {
            	if(tempB % i == 0) {
            		tempArrayListB.add(i);
            		System.out.println("tempArrayListB 값 : " + i);
            		tempB /= i;
            		break;
            	}
            }
		}
        
        System.out.println();
        boolean tempbool = false;
        
        //ArrayList<Integer> maxIndex = new ArrayList<>();
        int maxint = -1;

        loop1:
        for(int i = tempArrayListA.size() - 1; i >= 0; i--) {
        	for(int k = tempArrayListB.size() - 1; k >= 0; k--) {
        		
        		if(tempArrayListA.get(i) == tempArrayListB.get(k)) {
        			tempbool = true;
        			//maxIndex.add(k);
        			maxint = k;
        			System.out.println("maxIndex에 " + k + " 인덱스가 추가되었습니다.");
        			break loop1;
        		}
        	}
        }
        
        System.out.println();
        if(tempbool == true) {
//    		for(int k = maxIndex.size() - 1; k >= 0 ; k--) {
//    			int indexToRemove = maxIndex.get(k);
//    	        System.out.println("tempArrayListB의 " + indexToRemove + " 번째 인덱스에 해당하는 " + tempArrayListB.get(indexToRemove) + " 을 제거 하겠습니다.");
//    	        tempArrayListB.remove(indexToRemove);
//
//    		}
        	tempArrayListB.remove(maxint);
        }
        
        System.out.println();
        for(int i = 0; i < tempArrayListB.size(); i++) {
        	System.out.println("남은 tempArrayListB 의 값 : " + tempArrayListB.get(i));
        	if(tempArrayListB.get(i) != 2 && tempArrayListB.get(i) != 5) {
        		answer = 2;
        		System.out.println("answer : " + answer);
        		return answer;
        	}
        }
        
        answer = 1;

		System.out.println("answer : " + answer);
        return answer;
    }

}
