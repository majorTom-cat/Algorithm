package Lv0;

public class TestLv1 {

	public static void main(String[] args) {
		solution(2, 4, 17);
	}

	public static int solution(int n, long l, long r) {

		int answer = 0;
        String canto = "1";
        String resultCanto = "";
        String canto1 = "11011";
        String canto0 = "00000";

        if(n == 0) {
            answer = 1;
            return answer;
        }

        String tempString = "";
        for(int i = 0; i < n; i++) {

            for(int k = 0; k < canto.length(); k++) {
                tempString = canto.substring(k, k+1);
                if(tempString.equals("1")) {
                    resultCanto += canto1;
                } else if(tempString.equals("0")) {
                    resultCanto += canto0;
                }
            }
            canto = resultCanto;
            resultCanto = "";
        }

        int lInt = Long.valueOf(l).intValue();
        int rInt = Long.valueOf(r).intValue();

        for(int i = lInt - 1; i < rInt; i++) {
            if(canto.substring(i,i+1).equals("1")) {
                answer += 1;
            }
        }

        return answer;
    }
	
}
