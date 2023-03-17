package Lv0;

public class Lv0_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(976);
	}

	static public int solution(int n) {
        int answer = 2;
        
        for(int i = 1; i<= 1000; i++) {
        	if(i*i == n) {
        		answer = 1;
        	}
        }
        
        
        System.out.println(answer);
        return answer;
    }
	
}
