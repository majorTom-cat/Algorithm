package Lv0;

import java.util.Arrays;

public class Lv0_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution("Bcad");
	}

	static public String solution(String my_string) {
		String answer = "";
		String str = my_string.toLowerCase();
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		String result = new String(charArray);
		System.out.println(result);
		answer = result;
		return answer;
	}
}
