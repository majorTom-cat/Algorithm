// 정수 N개의 합
// 문제
// 정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.

// 작성해야 하는 함수는 다음과 같다.

// C, C11, C (Clang), C11 (Clang): int int sum(int *a, int n);
// a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
// n: 합을 구해야 하는 정수의 개수
// 리턴값: a에 포함되어 있는 정수 n개의 합

// C++, C++11, C++14, C++17, C++ (Clang), C++11 (Clang), C++14 (Clang), C++17 (Clang): int int sum(std::vector<int> &a);
// a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
// 리턴값: a에 포함되어 있는 정수 n개의 합

// Python 2, Python 3, PyPy, PyPy3: def solve(a: list) -> int
// a: 합을 구해야 하는 정수 n개가 저장되어 있는 리스트 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
// 리턴값: a에 포함되어 있는 정수 n개의 합 (정수)

// Java: int sum(int[] a); (클래스 이름: Test)
// a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
// 리턴값: a에 포함되어 있는 정수 n개의 합

// Go: sum(a []int) int
// a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
// 리턴값: a에 포함되어 있는 정수 n개의 합
package Function;

import java.util.Scanner;

public class FunctionProblem1 {

	public static void main(String[] args) {
		int countInteger = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("입력할 정수의 갯수 입력");
		countInteger = scan.nextInt();

		int integerArray[] = new int[countInteger];

		int inputInteger;
		System.out.println("합을 구할 정수 입력");
		for (int i = 0; i < countInteger; i++) {
			inputInteger = scan.nextInt();
			
			integerArray[i] = inputInteger;
		}

		int longSum = sum(integerArray);

		System.out.println();
		System.out.println("입력한 정수의 합");
		System.out.println(longSum);
	}

	static int sum(int integerArray[]) {
		int totalSum = 0;

		for (int i = 0; i < integerArray.length; i++) {
			totalSum += integerArray[i];
		}

		return totalSum;
	} //sum 메서드의 끝

} //FunctionProblem1 클래스의 끝
