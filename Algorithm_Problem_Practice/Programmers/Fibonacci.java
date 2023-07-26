import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("출력할 피보나치 수열 갯수 입력 : ");
		int n = scanner.nextInt();

		for(int i = 1; i <= n; i++) {
			System.out.printf("%d  ", fibonacci(i));
		}
		
	}
	
	static int fibonacci(int n) {
		if(n <= 1) {
			return 1;
		} else {
			return fibonacci(n - 2) + fibonacci(n - 1);
		}
		
	}

}
