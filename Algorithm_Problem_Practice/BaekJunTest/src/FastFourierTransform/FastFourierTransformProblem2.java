// 이동
// 문제
// N개의 수가 있는 X와 Y가 있다. 이때 X나 Y를 순환 이동시킬 수 있다.
// 순환 이동이란 마지막 원소를 제거하고 그 수를 맨 앞으로 다시 삽입하는 것을 말한다.
// 예를 들어, {1, 2, 3}을 순환 이동시키면 {3, 1, 2}가 될 것이고, {3, 1, 2}는 {2, 3, 1}이 된다.
// 순환 이동은 0번 또는 그 이상 할 수 있다. 이 모든 순환 이동을 한 후에 점수를 구하면 된다.
// 점수 S는 다음과 같이 구한다.

// S = X[0]×Y[0] + X[1]×Y[1] + ... + X[N-1]×Y[N-1]
//
// 이때 S를 최대로 하면 된다.
//
// 입력
// 첫째 줄에 N이 주어진다. 둘째 줄에는 X에 들어있는 N개의 수가 주어진다.
// 셋째 줄에는 Y에 있는 수가 모두 주어진다. N은 60,000보다 작거나 같은 자연수이고,
// X와 Y에 들어있는 모든 수는 100보다 작은 자연수 또는 0이다.

// 출력
// 첫째 줄에 S의 최댓값을 출력한다.

// 예제 입력 1
// 4
// 1 2 3 4
// 6 7 8 5
// 예제 출력 1
// 70

// 예제 입력 2
// 5
// 1 1 1 1 1
// 1 1 1 1 1
// 예제 출력 2
// 5

// 예제 입력 3
// 10
// 23 4 95 20 17 94 63 44 13 96
// 87 54 13 18 61 24 17 94 53 2
// 예제 출력 3
// 28886
package FastFourierTransform;

import java.util.Scanner;
import java.util.StringTokenizer;

public class FastFourierTransformProblem2 {

	public static void main(String[] args) {
		int N;
		String NString, xInput, yInput;

		Scanner scan = new Scanner(System.in);

		while (true) { // N의 입력을 받고 오류 체크
			System.out.print("원소의 수 N 입력 (0 <= N < 60000)");
			System.out.println();
			NString = scan.next();
			
			try {
				N = Integer.parseInt(NString);
				
			} catch (Exception e) {
				System.out.println("오류. 정수만 입력");
				continue;
			}
			
			if (N >= 60000 || N <= 0) {
				System.out.println("N의 범위 입력 오류. (0 <= N < 60000)");
				continue;
			}
			
			break;
		} // N 오류체크 while 문의 끝

		int xArray[] = new int[N];
		int yArray[] = new int[N];
	
		scan.nextLine(); // NString 을 입력했을 때의 Enter 값을 지우기 위함
		
		//======================================================================================
		while (true) { // X 배열 원소 수와 원소의 값을 제대로 입력 했는지 검사
			System.out.println("X 배열에 들어있는 원소 입력(각 원소는 100 이하의 자연수이며 N과 원소의 수는 같아야함)");
			xInput = scan.nextLine();
			
			if (checkArray(xInput, N)) {
				break;
			} else {
				continue;
			}
		} // X 배열을 잘 입력했으면 while 문 종료
		
		// X 배열 값 하나씩 대입
		StringTokenizer xInpuTokenizer = new StringTokenizer(xInput);
		while (xInpuTokenizer.hasMoreElements()) {
			for (int i = 0; i < N; i++) {
				xArray[i] = Integer.parseInt(xInpuTokenizer.nextToken());
			}
		}
		//======================================================================================
		
		while (true) { // Y 배열 원소 수와 원소의 값을 제대로 입력 했는지 검사
			System.out.println("Y 배열에 들어있는 원소 입력(각 원소는 100 이하의 자연수이며 N과 원소의 수는 같아야함)");
			yInput = scan.nextLine();
			
			if (checkArray(yInput, N)) {
				break;
			} else {
				continue;
			}
		} // Y 배열을 잘 입력했으면 while 문 종료
		
		// Y 배열 값 하나씩 대입
		StringTokenizer yInpuTokenizer = new StringTokenizer(yInput);
		while (yInpuTokenizer.hasMoreElements()) {
			for (int i = 0; i < N; i++) {
				yArray[i] = Integer.parseInt(yInpuTokenizer.nextToken());
			}
		}
		//======================================================================================

		int totalPoint = 0;
		int totalPointArray[] = new int[N];
		int maxPoint = 0;

		for (int i = 0; i < N; i++) { // (x, y 배열의 포인트를 구하고 x 배열을 한 번 순환시키는 것) 을 N번 반복
			totalPointArray[i] = getPoint(xArray, yArray, N); // 정수 배열의 포인트를 구함

			if (maxPoint < totalPointArray[i]) {
				maxPoint = totalPointArray[i];
			} // 최대 포인트인지 판별
			
			totalPoint = totalPointArray[i];
			System.out.println("point = " + totalPoint);

			xArray = cycleArray(xArray, N); // x 배열을 한 번 순환시킴
		}
		//======================================================================================

		System.out.println("maxPoint = " + maxPoint);

	} // main 메서드의 끝
	//==========================================================================================
	
	static boolean checkArray(String stringArray, int N) { // 문자열과 N을 입력받아 입력 오류 체크, 불리언 리턴
		StringTokenizer arrayTokenizer = new StringTokenizer(stringArray);
		int count = 0;
		int isInt;
		
		while (arrayTokenizer.hasMoreElements()) {
			try {
				isInt = Integer.parseInt(arrayTokenizer.nextToken());
				
				if (isInt >= 100 || isInt < 0) {
					System.out.println("오류. 배열의 원소는 0에서 99 사이의 자연수");
					return false;
				}
				
			} catch (Exception e) {
				System.out.println("오류. 배열의 원소는 정수만 입력");
				return false;
			}
			
			count++;
		}
		
		if (count != N) {
			System.out.println("입력한 N과 배열의 원소의 수가 같지 않음");
			return false;
		} // checkArray 메서드의 while 문 끝
		
		return true;
	} // checkArray 메서드의 끝
	//==========================================================================================

	static int getPoint(int xArray[], int yArray[], int N) { // 두개의 정수 배열과 원소 수를 입력받아 정수형 포인트를 리턴
		int totalPoint = 0;
		int point = 0;

		for (int i = 0; i < N; i++) {
			point = xArray[i] * yArray[i];
			totalPoint += point;
		}

		return totalPoint;
	} // getPoint 메서드의 끝
	//==========================================================================================

	static int[] cycleArray(int intArray[], int N) { // 정수 배열과 원소 수를 입력받아 1번 순환시킨 정수형 배열을 리턴
		int alterNumber = intArray[N - 1];

		for (int i = N - 1; i > 0; i--) {
			intArray[i] = intArray[i - 1];
		}

		intArray[0] = alterNumber;

		return intArray;
	} // cycleArray 메서드의 끝
	//==========================================================================================

} // FastFourierTransformProblem2 클래스의 끝
