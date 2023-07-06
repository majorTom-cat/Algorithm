package Lv0;

public class Lv0_26 {

	public static void main(String[] args) {
		solution(29423);

	}
	
	public static int solution(int order) {
        int answer = 0;
        
        while(order > 0) {
        	if(order % 10 == 3 || order % 10 == 6 || order % 10 == 9) {
        		answer++;
        	}
        	order /= 10;
        }
        System.out.println(answer);
        
        return answer;
    }

}
