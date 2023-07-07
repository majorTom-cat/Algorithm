package Lv1;

public class Lv1_10 {
	
	public static void main(String args[]) {
		solution("10203", "2");
	}
	
	public static int solution(String t, String p) {
        int answer = 0;
        
        int i = 0;
        for(i = 0; i <= t.length()-p.length(); i++) {
        	String temp = (String) t.subSequence(i, i+p.length());
        	 System.out.println(temp);
        	if(Long.parseLong(temp)<=Long.parseLong(p)) {
        		answer++;
        	}
        }
        System.out.println(answer);
        return answer;
    }
}
