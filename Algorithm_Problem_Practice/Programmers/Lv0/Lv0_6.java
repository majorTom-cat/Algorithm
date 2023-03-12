package Lv0;

public class Lv0_6 {

	public static void main(String[] args) {
		String fasdString = "aaaaAbbbbBccccCddddDeeee";

		int num = 5;
		String fas = "";

		int i = 0;

		for (i = 0; i < fasdString.length(); i += num) {
			System.out.println("i : " + i);
			if (fasdString.length() > i + num) {
				fas = fasdString.substring(i, i + num);
				System.out.println(fas);
				
				System.out.println();
			}
		}
		
		System.out.println("final i : " + i);
		
		System.out.println(fasdString.substring(i - num));

	}

	public String[] solution(String my_str, int n) {
		String[] answer = {};

		return answer;
	}

}
