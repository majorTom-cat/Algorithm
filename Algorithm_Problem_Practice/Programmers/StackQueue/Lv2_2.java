package StackQueue;

/*
 * 올바른 괄호
문제 설명
괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 예를 들어

"()()" 또는 "(())()" 는 올바른 괄호입니다.
")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
'(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.

제한사항
문자열 s의 길이 : 100,000 이하의 자연수
문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.
입출력 예
s	answer
"()()"	true
"(())()"	true
")()("	false
"(()("	false
입출력 예 설명
입출력 예 #1,2,3,4
문제의 예시와 같습니다.
 */
 

// 스택으로 풀다 문제가 단순해서 다시 카운트로 풀어 시간효율성을 높였지만 스택으로 푸는것이 확장성 및 정확도가 좋을것이라 생각한다.
public class Lv2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	boolean solution(String s) {
//      boolean answer = false;

//      if(s.substring(0, 1).equals(")")) {
//          return answer;
//      } else if(s.substring(s.length() - 1, s.length()).equals("(")) {
//          return answer;
//      } else if(s.length() % 2 != 0) {
//          return answer;
//      }

//      LinkedList<String> stack = new LinkedList<String>();
//      for(int i = 0; i < s.length(); i++) {
//          String temp = s.substring(i, i+1);
//          if(temp.equals(")")) {
//              if(stack.peek().equals("(")) {
//                  stack.pop();
//              } else {
//                  return answer;
//              }
//          } else if(temp.equals("(")) {
//              stack.push(temp);
//          }
//      }
     
//      if(stack.isEmpty()) {
//          answer = true;
//          return answer;
//      } else {
//          return answer;
//      }
     
     boolean answer = false;
     
     if(s.substring(0, 1).equals(")")) {
         return answer;
     } else if(s.substring(s.length() - 1, s.length()).equals("(")) {
         return answer;
     } else if(s.length() % 2 != 0) {
         return answer;
     }
     
     int cnt = 0;
     for(int i = 0; i < s.length(); i++) {
         String temp = s.substring(i, i+1);
         if(temp.equals(")")) {
             if(cnt > 0) {
                 cnt--;
             } else {
                 return answer;
             }
         } else if(temp.equals("(")) {
             cnt++;
         }
     }
     
     if(cnt == 0) {
         answer = true;
         return answer;
     } else {
         return answer;
     }
 }

}
