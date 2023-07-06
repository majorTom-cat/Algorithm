package Lv0;

public class Lv0_30 {

	public static void main(String[] args) {
		solution(10, 50, 5);

	}

	static int solution(int i, int j, int k) {
		int answer = 0;

		int temp;
		int num = 0;
		for (int cnt = i; cnt <= j; cnt++) {
			num = cnt;
			while (num != 0) {
				temp = num % 10;
				num = num / 10;
				if (temp == k) {
					answer++;
					System.out.println("answer increase : " + "temp : " + temp + ", " + "k : " + k);
				}
				System.out.println("temp : " + temp);
				System.out.println("num : " + num);

			}
			System.out.println("--------------------------");
		}
		System.out.println("answer : " + answer);
		return answer;
	}

}
