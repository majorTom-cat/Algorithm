package ArrayProblem;
import Module.ReturnRandomNumberClass;

//최소, 최대
//문제
//N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

//입력
//첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
//모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

//출력
//첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.

//예제 입력 1 
//5
//20 10 35 30 7

//예제 출력 1 
//7 35
public class ArrayProblem3 extends ReturnRandomNumberClass {// 1000000 은 너무 커서 100 으로 함

	static int MAX = 100;

	public static void main(String[] args) {
		int N = returnRandomNumber_OneToParam(100);
		int intArray[] = new int[N];

		// first line
		System.out.println("정수 배열 intArray 의 길이(N) : " + N);
		System.out.println();

		// second line
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			int ramdomNumber = returnRandomNumber_ZeroToParamNegative(MAX);
			intArray[i] = ramdomNumber;
			System.out.printf("%3d \t", intArray[i]);
			cnt++;
			if (cnt % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		if (cnt % 10 != 0) {
			System.out.println();
		}

		// print line
		int minValue = 0;
		int maxValue = 0;

		int minValueIndex = 0;
		int maxValueIndex = 0;

		for (int i = 0; i < N; i++) {
			if (maxValue < intArray[i]) {
				maxValue = intArray[i];
				maxValueIndex = i + 1;
			}

			if (minValue > intArray[i]) {
				minValue = intArray[i];
				minValueIndex = i + 1;
			}
		}
		System.out.printf("최소값 : %3d [%1d 번째 값], \t 최대값 : %3d [%2d 번째 값]", minValue, minValueIndex, maxValue,
				maxValueIndex);
	}

}
