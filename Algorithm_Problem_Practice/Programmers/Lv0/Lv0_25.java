package Lv0;

public class Lv0_25 {

	public static void main(String[] args) {
		solution("dfjardstddetckdaccccdegk", 4);

	}
	
	static public String solution(String cipher, int code) {
	        String answer = "";
	        
	        for (int j = code - 1; j < cipher.length(); j += code) {
	        	answer += cipher.charAt(j);
	        }
	        System.out.print(answer);
	        return answer;
	    }

}
