//7의 개수
//문제 설명
//머쓱이는 행운의 숫자 7을 가장 좋아합니다. 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.
//
//제한사항
//1 ≤ array의 길이 ≤ 100
//0 ≤ array의 원소 ≤ 100,000
//입출력 예
//array	result
//[7, 77, 17]	4
//[10, 29]	0
//입출력 예 설명
//입출력 예 #1
//
//[7, 77, 17]에는 7이 4개 있으므로 4를 return 합니다.
//입출력 예 #2
//
//[10, 29]에는 7이 없으므로 0을 return 합니다.

package Lv0;

import java.util.StringTokenizer;

public class Lv0_7 {

	public static void main(String[] args) {
		
		int[] arr = {7, 4243, 66, 777, 47};
		
		solution(arr);

	}
	
	static int solution(int[] array) {
        int answer = 0;
        int arrayLength = array.length;
        
        for(int i = 0; i < arrayLength; i++) {
        	System.out.println("array : " + array[i]);
        	String temp = "";
        	 
        	String[] arrayString = Integer.toString(array[i]).split(""); 
        	for(int j = 0; j < arrayString.length; j++) {
        		temp = arrayString[j];
				if (temp.equals("7")) {
					 System.out.println(temp + " 와(과)  7은 같습니다!");
					answer++;
				} else {
					 System.out.println(temp + " 와(과) 7은 다릅니다.");
				}
				
			}
        	
        }
        
        System.out.println(answer);
        return answer;
    }

}
