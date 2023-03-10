package ArrayProblem;

import Module.ReturnRandomNumberClass;

// X보다 작은 수
// 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

//입력
//첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)  // 10000은 너무 커서 100으로 함
//
//둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
//
//출력
//X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
//
//예제 입력 1 
//10 5
//1 10 4 9 2 3 8 5 7 6
//예제 출력 1 
//1 4 2 3
public class ArrayProblem2 extends ReturnRandomNumberClass {

	public static void main(String[] args) {
		int N = returnRandomNumber_OneToParam(100);
		int A[] = new int[N];

		int X = returnRandomNumber_OneToParam(100);

		// first line
		System.out.println("1 에서 100 사이의 정수 N = " + N);
		System.out.println("1 에서 100 사이의 정수 X = " + X);
		System.out.println();

		// second line
		int cnt = 0;
		System.out.println(N + " 개 (N 개)의 배열 A 출력");
		for (int i = 0; i < N; i++) {
			A[i] = returnRandomNumber_OneToParam(100);
			System.out.print(A[i] + "\t");
			cnt++;

			if (cnt % 10 == 0) {
				System.out.println();
			}
		}
		if (cnt % 10 != 0) {
			System.out.println();
		}

		// third line
		cnt = 0;
		System.out.println();
		System.out.println(X + " (X 값)보다 작은 정수 출력");
		for (int i = 0; i < N; i++) {
			if (A[i] < X) {
				System.out.print(A[i] + "\t");
				cnt++;
				if (cnt % 10 == 0) {
					System.out.println();
				}
			}

		}
		System.out.println();
		if (cnt % 10 != 0) {
			System.out.println();
		}
		System.out.print(cnt + " 개");
	}
}