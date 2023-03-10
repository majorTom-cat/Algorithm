package Module;
// 정수를 파라미터로 주면 1에서 입력 파라미터 정수 사이의 숫자를 리턴하는 메서드

public class ReturnRandomNumberClass {

//	public static void main(String[] args) {
//		int integers = 100;
//		int N = returnRandomNumber(integers);
//		System.out.println(N);
//
//	}

	public static int returnRandomNumber_OneToParam(int Number) {
		int randomNumber = (int) (Math.random() * (Number) + 1);
		return randomNumber;
	}

	public static int returnRandomNumber_ZeroToParam(int Number) {
		int randomNumber = (int) (Math.random() * (Number + 1));
		return randomNumber;
	}

	public static int returnRandomNumber_ZeroToParamNegative(int Number) {
		int symbol = returnRandomNumber_ZeroToParam(2);
		int intNumber;
		if (symbol == 0) {
			intNumber = returnRandomNumber_ZeroToParam(Number);
		} else {
			intNumber = -returnRandomNumber_ZeroToParam(Number);
		}

		return intNumber;
	}

}
