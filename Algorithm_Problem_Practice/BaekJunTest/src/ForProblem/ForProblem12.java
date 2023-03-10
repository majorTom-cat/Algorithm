// 더하기 사이클
// 문제 0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다.
// 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다.
// 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다.
// 다음 예를 보자.

// 26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다.
// 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.

// 위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.

// N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 N이 주어진다. N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.

// 출력
// 첫째 줄에 N의 사이클 길이를 출력한다.

// 예제 입력 1
// 26
// 예제 출력 1
// 4

// 예제 입력 2
// 55
// 예제 출력 2
// 3

// 예제 입력 3
// 1
// 예제 출력 3
// 60

// 예제 입력 4
// 0
// 예제 출력 4
// 1

// 예제 입력 5
// 71
// 예제 출력 5
// 12
package ForProblem;

import java.util.Scanner;

public class ForProblem12 {

	public static void main(String[] args) {
		String nOriginalString = null;
		String nString = null;
		int n = 0, count = 0;

		n = checkInput(n); // 입력하는 숫자의 값 유효성 검사

		System.out.println();

		if (n < 10) {
			String nToString = Integer.toString(n); // int to String
			nOriginalString = "0" + nToString; // 1자리수인 n 을 "0" 뒤에 더해 "0n" 으로 N
												// 을 정의
		} else {
			nOriginalString = Integer.toString(n); // int to String
		}
		char firstNumberChar = nOriginalString.charAt(0); // String to char
		char secondNumberChar = nOriginalString.charAt(1); // String to char

		int addValueInt = 0;

		// 첫 인수 값 추적
		System.out.println("firstNumber : " + firstNumberChar);
		System.out.println("secondNumber : " + secondNumberChar);
		System.out.println("addValue : " + addValueInt);
		System.out.println("nString : " + nString);
		System.out.println("사이클수 : " + count);
		System.out.println();

		while (true) {

			addValueInt = Character.getNumericValue(firstNumberChar) + Character.getNumericValue(secondNumberChar);
			// char to int

			if (addValueInt < 10) {

				firstNumberChar = secondNumberChar;
				secondNumberChar = Character.forDigit(addValueInt, 10); // int 를 10진수로 바꿔 char로 변환

				nString = Character.toString(firstNumberChar) + Character.toString(secondNumberChar);
			} else {

				firstNumberChar = secondNumberChar;

				String temporaryNumberString = Integer.toString(addValueInt); // int to String
				secondNumberChar = temporaryNumberString.charAt(1);

				nString = Character.toString(firstNumberChar) + Character.toString(secondNumberChar);
			}

			if (nString.equals(nOriginalString)) {
				// nString == nOriginalString 을 써서 애먹었다. String 객체의 저장 방식을 알았음에도 이런 부분을 놓친 탓이다.

				count++;

				// 인수 값 추적
				System.out.println("firstNumber : " + firstNumberChar);
				System.out.println("secondNumber : " + secondNumberChar);
				System.out.println("addValue : " + addValueInt);
				System.out.println("nString : " + nString);
				System.out.println("사이클 수 : " + count);
				System.out.println();
				break;
			} else {
				count++;

				// 인수 값 추적
				System.out.println("firstNumber : " + firstNumberChar);
				System.out.println("secondNumber : " + secondNumberChar);
				System.out.println("addValue : " + addValueInt);
				System.out.println("nString : " + nString);
				System.out.println("사이클 수 : " + count);
				System.out.println();

				continue;
			}

		} // while 문의 끝

		// 최종 결론 출력
		System.out.println();
		System.out.println("nOriginalString : " + nOriginalString);
		System.out.println("final nString : " + nString);
		System.out.println("최종 사이클 수 : " + count);

	} // main 메서드의 끝

	/**
	 * 입력하는 숫자의 값 유효성 검사 0에서 99까지의 범위 검사 &#10;
	 * 
	 * 숫자가 아닌 다른 값을 입력하면 에러 catch
	 * <pre>fasd </pre>
	 */
	static int checkInput(int n) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			try {
				System.out.print("숫자 입력 ==> ");
				n = scan.nextInt();

				if (n > 99 || n < 0) {
					System.out.println("입력 오류. 0부터 99까지의 정수만 입력하시오.");
					continue;
				}
			} catch (Exception e) {
				System.out.println("입력 오류. 0부터 99까지의 정수만 입력하시오.");
				continue;
			}

			break;

		}
		return n;
	} // checkInput 메서드의 끝

} // ForProblem12 클래스의 끝