package Lv0;

public class Lv0_32 {

	public static void main(String args[]) {
		
		solution("101", "01");
		
	}
	
	public static String solution(String bin1, String bin2) {
        String answer = "";
        
        int binaryToDecimal1 = Integer.parseInt(bin1, 2);
        int binaryToDecimal2 = Integer.parseInt(bin2, 2);
        
        int temp = binaryToDecimal1 + binaryToDecimal2;
        System.out.println("bin1 : " + binaryToDecimal1);
        System.out.println("bin2 : " + binaryToDecimal2);
        
        answer = Integer.toBinaryString(temp);
        System.out.println("binaryString : " + answer);
        		
        return answer;
    }
	
}
