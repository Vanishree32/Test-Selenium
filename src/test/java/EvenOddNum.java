import java.util.Scanner;

public class EvenOddNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");    //// with using mod -- Method 1
		int num = sc.nextInt();
		// using Modules
//		if (num % 2 == 0)
//			System.out.println("Even");
//		else
//			System.out.println("odd");

		// without using mod -- Method 2

		if (num / 2 * 2 == num) {

			System.out.println("Even");

		}
		else
			
			System.out.println("Without mod ODD");
	
	
	
	// Using Terniery Operator -- Method 3
	
	
	String ev=(num%2==0)?"Even":" Terniery Oddd";
	System.out.println(ev);
	
	
	
	// Using Switch case -- Method 4
	
	switch (num%2) {
	
	case 0:
		System.out.println("Switch even");
		break;
		
	case 1:
		
		System.out.println("Switch Odd");
		
	}
		
		// Using String Array -- Method 5
		
		String str[]= {"Strr Even","strr Odd"};
		System.out.println("String array :" +str[num%2]);
	
	
	}
	
	}
	
	
	
	
	
	
	
	


