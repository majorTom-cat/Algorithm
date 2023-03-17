package Lv0;

public class Lv0_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(7, 15);
	}
	
	static public int solution(int n, int t) {
        int answer = 0;
        answer = n;
        for(int i = 0; i < t; i++) {
        	answer *= 2;
        }
        
        System.out.println("answer : " + answer);
        return answer;
    }

}
