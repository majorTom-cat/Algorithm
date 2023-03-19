package Lv0;

import java.util.Stack;
import java.util.StringTokenizer;

public class Lv0_17 {

	public static void main(String[] args) {
		solution("333 - 4 + 1");

	}

	static public int solution(String my_string) {
        int answer = 0;
        StringTokenizer stringTokenizer = new StringTokenizer(my_string, " ");
        Stack<String> stack = new Stack<>();
        
        int firstNum, secondNum, cnt = 0;
        String opetator = null;
        while (stringTokenizer.hasMoreElements()) {
			String temp = stringTokenizer.nextToken();
			
			switch (temp) {
			case "+": {
				opetator = "+";
				System.out.println(temp);
				break;
			}
			case "-": {
				opetator = "-";
				System.out.println(temp);
				break;
			}
			default:
				System.out.println(temp);
				stack.add(temp);
				cnt++;
				if(cnt == 2) {
					secondNum = Integer.parseInt(stack.pop());
			        firstNum = Integer.parseInt(stack.pop());
			        
			        if(opetator.equals("+")) {
			        	answer = firstNum + secondNum;
			        } else if(opetator.equals("-")){
			        	answer = firstNum - secondNum;
			        }
			        
			        stack.add(Integer.toString(answer));
			        cnt -= 1;
				}
				
				
				break;
			}
		
		}
        
        answer = Integer.parseInt(stack.pop());
        System.out.println(answer);
        return answer;
    }
	
}
