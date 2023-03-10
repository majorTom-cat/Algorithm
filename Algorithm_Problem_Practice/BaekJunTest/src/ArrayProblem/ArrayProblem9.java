// 평균은 넘겠지
// 문제
// 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.

// 입력
// 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.

// 둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다.
// 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

// 출력
// 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.

// 예제 입력 1
// 5
// 5 50 50 70 80 100
// 7 100 95 90 80 70 60 50
// 3 70 90 80
// 3 70 90 81
// 9 100 99 98 97 96 95 94 93 91

// 예제 출력 1
// 40.000%
// 57.143%
// 33.333%
// 66.667%
// 55.556%
package ArrayProblem;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ArrayProblem9 {

	public static void main(String[] args) {
		int C;
		String studentNumberAndPointString = null;

		Scanner scan = new Scanner(System.in);

		System.out.println("테스트 케이스 수 입력");
		C = scan.nextInt();

		scan.nextLine();
		
		double survivorRationArray[] = new double[C];

		System.out.println("학생의 수와 각 점수를 공백으로 구분해 입력(ex : 5 50 40 80 20 30)");
		
		for (int i = 0; i < C; i++) { //=============================================================
			
			studentNumberAndPointString = scan.nextLine();

			StringTokenizer token = new StringTokenizer(studentNumberAndPointString); //*************************

			double studentNumber = Integer.parseInt(token.nextToken());

			double studentCount = 0, total = 0, average = 0;
			while (token.hasMoreTokens()) {

				int studentPoint = Integer.parseInt(token.nextToken());
				studentCount++;
				total += studentPoint;

			}
			average = (total / studentCount);
			System.out.println("average = " + average); //*************************************************************

			token = new StringTokenizer(studentNumberAndPointString);

			studentNumber = Integer.parseInt(token.nextToken());

			double survivorCount = 0, studentPoint = 0;
			while (token.hasMoreTokens()) {
				studentPoint = Integer.parseInt(token.nextToken());

				if (studentPoint > average) {
					survivorCount++;
				}
			}

			double survivorRatio = survivorCount / studentCount * 100;
			
			survivorRationArray[i] = survivorRatio;

			

		} //=======================================================================================

		System.out.println();
		
		for (int i = 0; i < C;i++) {
			System.out.println();
			System.out.printf("평균을 넘는 학생의 비율 case #" + (i+1) + " : " + survivorRationArray[i] + " %%");
		}
		
		
		
	}

}
