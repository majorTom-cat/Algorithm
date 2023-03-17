package Lv0;

public class Lv0_11 {

	public static void main(String[] args) {
		solution("fffffasd", "fasd");

	}

	static public int solution(String str1, String str2) {
        int answer = 2;
        
        if(str1.contains(str2)) answer = 1;
        
        System.out.println("answer : " + answer);
        
        return answer;
    }
}
