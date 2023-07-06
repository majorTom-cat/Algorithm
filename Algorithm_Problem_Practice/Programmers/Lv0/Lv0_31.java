package Lv0;

import java.util.Arrays;

public class Lv0_31 {

	public static void main(String[] args) {
		solution("olleh", "hello");

	}
	
	public static int solution(String before, String after) {
        int answer = 0;
        
        char[] temp;
        temp = before.toCharArray();
        Arrays.sort(temp);
        String tempString = new String(temp);
        char[] aftertemp;
        aftertemp = after.toCharArray();
        Arrays.sort(aftertemp);
        String aftertempString = String.valueOf(aftertemp);
        if(tempString.equals(aftertempString)) answer = 1;

        System.out.println(answer);
        return answer;
    }

}
