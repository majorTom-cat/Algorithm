package Lv0;

public class Lv0_13 {

	public static void main(String[] args) {
		solution(930212);

	}

	static public int solution(int n) {
        int answer = 0;
        int temp;
        int num = n;
        String str = Integer.toString(n);
        
        for(int i = 0; i < str.length(); i++) {
        	
        	temp = num % 10;
        	num /= 10;
        	answer += temp;
        	
        }
        
        
        
        System.out.println("answer = " + answer);
       
        
        return answer;
    }
	
}
