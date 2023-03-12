package Lv0;

public class Lv0_6 {

	public static void main(String[] args) {
		String fasdString = "aaaaAbbbbBccccCddddDeeee";

		//		int num = 5;
		//		String fas = "";
		//
		//		int i = 0;
		//
		//		for (i = 0; i < fasdString.length(); i += num) {
		//			System.out.println("i : " + i);
		//			if (fasdString.length() > i + num) {
		//				fas = fasdString.substring(i, i + num);
		//				System.out.println(fas);
		//				
		//				System.out.println();
		//			}
		//		}
		//		
		//		System.out.println("final i : " + i);
		//		
		//		System.out.println(fasdString.substring(i - num));
		
		solution("abc1Addfggg4556b", 6);

	}

	public static String[] solution(String my_str, int n) {
		
		int arrayLength = 0;
		if ((my_str.length() % n) == 0) {
			arrayLength = (my_str.length() / n);
		} else {
			arrayLength = (my_str.length() / n) + 1;
		}
		
		String[] answer = new String [arrayLength];

		String fas = "";

		int i = 0;
		int cnt = 0;
		int my_strLength = my_str.length();

		for (i = 0; i < my_strLength; i += n) {
			System.out.println("i : " + i);
			if (my_strLength > i + n) {
				fas = my_str.substring(i, i + n);
				System.out.println(fas);
				System.out.println();
				
				if (answer[cnt] == null) {
					answer[cnt] = fas;
				} else {
					cnt++;
					answer[cnt] = fas;
				}
				System.out.println("cnt : " + cnt);
			}
		}

		System.out.println("final i : " + i);
		fas = my_str.substring(i - n);
		System.out.println(my_str.substring(i - n));
		if (answer[cnt] == null) {
			answer[cnt] = fas;
		} else {
			cnt++;
			answer[cnt] = fas;
		}
		System.out.println("cnt : " + cnt);
		System.out.println();
		System.out.println("answer");
		for (int j = 0 ; j < answer.length; j++) {
			System.out.println(answer[j]);
		}
		
		return answer;
	}

}
