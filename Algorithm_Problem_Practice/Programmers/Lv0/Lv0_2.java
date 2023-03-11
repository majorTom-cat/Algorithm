// 다음에 올 숫자
// 문제 설명
// 등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.
//
// 제한사항
// 2 < common의 길이 < 1,000
// -1,000 < common의 원소 < 2,000
// common의 원소는 모두 정수입니다.
// 등차수열 혹은 등비수열이 아닌 경우는 없습니다.
// 등비수열인 경우 공비는 0이 아닌 정수입니다.
// 입출력 예
// common result
// [1, 2, 3, 4] 5
// [2, 4, 8] 16
// 입출력 예 설명
// 입출력 예 #1
//
// [1, 2, 3, 4]는 공차가 1인 등차수열이므로 다음에 올 수는 5이다.
// 입출력 예 #2
//
// [2, 4, 8]은 공비가 2인 등비수열이므로 다음에 올 수는 16이다.

package Lv0;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Lv0_2 {

	static ArrayList<Float> arrayList = new ArrayList<>();
	static double equalRatio, equalDifference;

	public static void main(String[] args) {

		while (checkInput()) {
			System.out.println("입력 오류. 정수로 이루어진 수열만 입력하세요.");
		}
		//System.out.println("arrayList : " + arrayList);

		boolean isGeometricSequence = false;
		boolean isArithmeticSequence = false;
		double firstNum, secondNum, thirdNum;

		int result;
		int lastIndex = arrayList.size() - 1;

		firstNum = arrayList.get(0);
		secondNum = arrayList.get(1);
		thirdNum = arrayList.get(2);

		equalRatio = secondNum / firstNum;

		if (equalRatio == thirdNum / secondNum)
			isGeometricSequence = true;
		if (isGeometricSequence) {
			result = (int) (arrayList.get(lastIndex) * equalRatio);
			System.out.println("result : " + result);
			return;
		}

		equalDifference = secondNum - firstNum;
		if (equalDifference == thirdNum - secondNum)
			isArithmeticSequence = true;
		if (isArithmeticSequence) {
			result = (int) (arrayList.get(lastIndex) + equalDifference);
			System.out.println("result : " + result);
			return;
		}

	}

	static boolean checkInput() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("수열을 입력하세요. 입력 예시 ==> [1, 2, 3, 4, 5], 수열의 길이는 3~999 사이, 수열의 원소는 -1000보다 크고 2000보다 작은 정수");
		
		int[] fasd = {1, 2, 3, 4};
		System.out.println(fasd[0]);
		StringTokenizer inputTokenizer = new StringTokenizer(scan.nextLine(), ", []");
		
		// 수열에 부동소수와 구분자만 입력되었는지 검사
		while (inputTokenizer.hasMoreElements()) {
			try {
				arrayList.add(Float.parseFloat((String) inputTokenizer.nextElement()));
			} catch (Exception e) {
				return true;
			}
		}
		
		int lastIndex = arrayList.size() - 1;
		// 수열의 길이 검사
		if(arrayList.size() <= 2 || arrayList.size() >= 1000) return true; 
		
		// 수열의 공비가 0인지 검사
		for(int i = 0; i < lastIndex; i++) { 
			if( (arrayList.get(i+1)/arrayList.get(i)) == 0.) {
				return true;
			}
		}
		
		// 수열의 원소가 유효범위에 있는지 검사
		for(int i = 0; i < lastIndex; i++) {
			if(arrayList.get(i) <= -1000 || arrayList.get(i) >= 2000) {
				return true;
			}
		}
	
		return false;
	}

}
