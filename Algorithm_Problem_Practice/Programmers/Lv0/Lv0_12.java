package Lv0;

import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Lv0_12 {

	public static void main(String[] args) {
		String[] inputQuiz = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
		
		solution(inputQuiz);
	}

	static public String[] solution(String[] quiz) {
		String[] answer = new String[quiz.length];
		Stack<Integer> stack = new Stack<>();
		int quizLength = quiz.length;
		String temp, operator = null;
		int firstNum, secondNum, result = 0;

		for (int i = 0; i < quizLength; i++) {
			StringTokenizer quizToken = new StringTokenizer(quiz[i], " ");

			while (quizToken.hasMoreElements()) {
				temp = (String) quizToken.nextElement();
				
				switch (temp) {
				case "+": {
					operator = "+";
					break;
				}
				case "-": {
					operator = "-";
					break;
				}
				case "=": {
					secondNum = stack.pop();
					firstNum = stack.pop();
					
					if(operator.equals("+")) {
						result = firstNum + secondNum;
					} else if (operator.equals("-"))  {
						result = firstNum - secondNum;
					}
					break;
				}

				default:
					stack.add(Integer.parseInt(temp));
				}

			}
			if(stack.pop() == result) {
				answer[i] = "O";
			} else answer[i] = "X" ;

		}
		
		System.out.println("answer : " + Arrays.toString(answer));

		return answer;
	}
}
