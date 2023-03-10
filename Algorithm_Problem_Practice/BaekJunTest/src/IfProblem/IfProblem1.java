//사분면 고르기
//문제
//흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다.
//사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다. "Quadrant n"은 "제n사분면"이라는 뜻이다.
//예를 들어, 좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다.
//점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.

//점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오.
//단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.

//입력
//첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다.
//(−1000 ≤ y ≤ 1000; y ≠ 0)

//출력
//점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.

//예제 입력 1 
//12
//5

//예제 출력 1 
//1

//예제 입력 2 
//9
//-13

//예제 출력 2 
//4
package IfProblem;

import java.util.Scanner;

public class IfProblem1 {

	public static void main(String[] args) {

		int coordination = 0;

		// coordination input line
		int xValue = 0;
		int yValue = 0;
		String x = "x";
		String y = "y";

		xValue = inputXY(xValue, x);
		yValue = inputXY(yValue, y);

		// implement line
		if (xValue > 0) {
			if (yValue > 0)
				coordination = 1;
			else
				coordination = 4;

		} else if (xValue < 0) {
			if (yValue < 0)
				coordination = 3;
			else
				coordination = 2;

		}
		System.out.printf("점 (%d, %d) 의 사분면은 %d", xValue, yValue, coordination);
	}

	static int inputXY(int xyValue, String xy) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			try {
				System.out.println(xy + " 좌표를 입력하시오 (-1000 <= x <= 1000, x != 0 ) : ");
				xyValue = scan.nextInt();
			} catch (Exception e) {
				System.out.println("오류. " + e.getMessage());

				if (scan.hasNext()) {
					String message = scan.next();
					System.out.println("오류 처리 문자 : " + message);
				}
				continue;
			}

			if (xyValue == 0) {
				continue;
			}

			break;
		}
		return xyValue;
	}

} // main 메서드의 끝
