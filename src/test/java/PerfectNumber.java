import java.util.Scanner;

public class PerfectNumber {

	
		// num divisors sum is equal to Num itself
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Num :");
			int n = sc.nextInt();
			int sum = 0;
			for (int i = 1; i <= n / 2; i++) {
				if (n % i == 0) {
					sum = sum + i;
				}
			}
			if(sum==n) {
				System.out.println("Entered num is Perfect Num");
			}
			else {
				System.out.println("Entered num is NOT  Perfect Num");
			}
		}
	
	}


