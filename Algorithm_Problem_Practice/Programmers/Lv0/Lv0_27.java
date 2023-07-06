package Lv0;

public class Lv0_27 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 6};
		solution(arr, 5);

	}
	
	public static int solution(int[] array, int n) {
        int answer = array[0];
        
        int mindef = Math.abs(array[0]-n);
        int def = 0;
        int index = 0;
        int temp = 0;
        
        for(int i = 1; i < array.length; i++) {
        	def = Math.abs(array[i]-n);
        	if(def <= mindef) {
        		mindef = def;
        		index = i;
        		temp = array[i];
        		
        		if (answer < temp) {
        			System.out.println("a");
        		} else {
        			answer = temp;
        		}
        		
        	}
        }

        
        System.out.println("index : " + index);
        System.out.println("answer : " + answer);
        
        return answer;
    }

}
