package Lv0;

import java.util.ArrayList;
import java.util.Arrays;

public class Lv0_16 {

	public static void main(String[] args) {
		String a[] = {"a",  "b", "c"};
		String b[] = {"com", "b", "d", "p", "c"};
		
		String c[] = {"n", "omg"};
		String d[] = {"m", "dot"};
		solution(a , b);

	}
	
	static  public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for(int i = 0; i < s1.length; i++) {
        	for(int j = 0; j < s2.length; j++) {
        		if(s1[i].equals(s2[j])) answer++;
        	}
        }
        
        
        System.out.println(answer);
        return answer;
    }
	
}
