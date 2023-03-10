package ArrayProblem;

//개수 세기
//문제
//총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 정수가 공백으로 구분되어져있다. 셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.
//
//출력
//첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.
//
//예제 입력 1 
//11
//1 4 1 2 4 2 4 2 3 4 4
//2
//예제 출력 1 
//3
//예제 입력 2 
//11
//1 4 1 2 4 2 4 2 3 4 4
//5
//예제 출력 2 
//0
import java.util.Scanner;

public class ArrayProblem1 {

	static int MAX = 100;

	public static void main(String[] args) {
		// first line
		int integerN = returnRandomNumber();
		System.out.println("N = " + integerN);
		System.out.println();

		// second line
		int arr[] = new int[MAX];
		int cnt = 0;
		for (int i = 0; i < integerN; i++) {
			int j = returnRandomNumber();
			arr[i] = j;
			cnt++;

			System.out.print(arr[i] + "\t");
			if (cnt % 10 == 0) {
				System.out.println();
			}
		}
		if (cnt % 10 != 0) {
			System.out.println();
		}

		// third line
		Scanner scan = new Scanner(System.in);

		int v;
		System.out.println();
		System.out.println("-100 보다 크거나 같으며 100 보다 작거나 같은 임의의 정수 입력 ==> ");
		v = scan.nextInt();
		int findSameNumber = 0;
		// implement line
		for (int i = 0; i < integerN; i++) {

			if (v == arr[i]) {
				findSameNumber++;
			}
		}
		System.out.println("입력한 정수 ( " + v + " ) 와 같은 값의 정수의 갯수 : " + findSameNumber);
	}

	static int returnRandomNumber() {
		int N = (int) (Math.random() * 100 + 1);
		return N;
	}

}
