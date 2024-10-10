import java.util.Scanner;

public class SpecialTwoDigit {

		public static boolean isSpecialDigit(int num) {
			if (num < 10) {
				return false;
			}
			else {
				int temp = num;
				
				int d1 = num / 10; // first digit we will recieve
				int d2 = num % 10; // second digit we will recieve
				int sum = (d1 + d2) + (d1 * d2);
				if (sum == temp) {
					return true;
				}
				return false;
			}
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			System.out.println("Enter the numer:");
			boolean rs = isSpecialDigit(num);
			if (rs == false) {
				System.out.println("user enter single digit");
			} else {
				System.out.println("entered num is psecial two digit num");
			}
		}
	

	}


