package Lv0;

public class Lv0_24 {
	
	public static void main(String args[]) {
		System.out.println(solution("cccCCC"));
	}
	
	public static String solution(String my_string) {
        String answer = "";
        StringBuilder mys = new StringBuilder(my_string);
        char temp;
        for(int i = 0; i < mys.length() ; i++) {
            if(Character.isUpperCase(mys.charAt(i))) {
            	answer += Character.toLowerCase(mys.charAt(i));
            } else {
            	answer += Character.toUpperCase(mys.charAt(i));
            }
        }
        
        return answer;
    }
}
