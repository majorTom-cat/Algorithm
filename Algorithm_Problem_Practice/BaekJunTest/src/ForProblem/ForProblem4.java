//영수증
//문제
//준원이는 저번 주에 살면서 처음으로 코스트코를 가 봤다. 정말 멋졌다. 그런데, 몇 개 담지도 않았는데 수상하게 높은 금액이 나오는 것이다!
//준원이는 영수증을 보면서 정확하게 계산된 것이 맞는지 확인해보려 한다.

//영수증에 적힌,
//1. 구매한 각 물건의 가격과 개수
//2. 구매한 물건들의 총 금액
//을 보고 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.

//입력
//첫째 줄에는 영수증에 적힌 총 금액 X가 주어진다.

//둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다.

//이후 N개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.

//출력
//구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다. 일치하지 않는다면 No를 출력한다.

//제한

//1 ≤ X ≤ 1,000,000,000
//1 ≤ N ≤ 100 
//1 ≤ a ≤ 1,000,000 
//1 ≤ b ≤ 10

//예제 입력 1 
//260000
//4
//20000 5
//30000 2
//10000 6
//5000 8

//예제 출력 1 
//Yes

//영수증에 적힌 구매할 물건들의 목록으로 계산한 총 금액은 20000 × 5 + 30000 × 2 + 10000 × 6 + 5000 × 8 = 260000원이다.
//이는 영수증에 적힌 총 금액인 260000원과 일치한다. 

//예제 입력 2 
//250000
//4
//20000 5
//30000 2
//10000 6
//5000 8

//예제 출력 2 
//No

package ForProblem;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ForProblem4 {

	static Scanner scan = new Scanner(System.in);
	static int calculatedTotalPrice = 0;

	public static void main(String[] args) {

		System.out.println("총 가격 입력 : ");
		int totalPrice = scan.nextInt();
		System.out.println("구매한 물건의 종류의 수 : ");
		int numberOfKinds = scan.nextInt();

		scan.nextLine(); // nextInt 메서드에 의한 개행문자 Enter 를 제거해주기 위함

		for (int i = 0; i < numberOfKinds; i++) { // -------- 물건의 종류의 수 만큼 반복 -----------------------
			checkInput();
		} // ----------------------------------------------------------------------------------------------

		System.out.println();
		if (totalPrice == calculatedTotalPrice) {
			System.out.println("영수증 총 가격 : " + totalPrice);
			System.out.println("계산된 총 가격 : " + calculatedTotalPrice + " (O)");
		} else {
			System.out.println("영수증 총 가격 : " + totalPrice);
			System.out.println("계산된 총 가격 : " + calculatedTotalPrice + " (X)");
		}

	}// main 메서드의 끝

	static void checkInput() {
		StringTokenizer token;
		while (true) {

			try {
				System.out.println("구매한 물건가격과 수량을 입력(입력양식 ==> 물견가격 수량) : ");
				String fasdString = scan.nextLine();
				token = new StringTokenizer(fasdString);

				int productPrice = Integer.parseInt(token.nextToken());
				int numberOfProducts = Integer.parseInt(token.nextToken());

				calculatedTotalPrice = calculatedTotalPrice + productPrice * numberOfProducts;

			} catch (Exception e) {
				System.out.println("입력 양식 오류. 재 입력 하시오");
				continue;
			}

			break;
		}

	} // checkInput 메서드의 끝

} // ForProblem4 클래스의 끝
