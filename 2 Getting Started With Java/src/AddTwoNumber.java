/* Addition of two number by taking input
 * 
 */

import java.util.Scanner;

public class AddTwoNumber {

	public static void main(String[] args) {
		int a, b;
		System.out.println("enter two number");
		
		Scanner s = new Scanner(System.in);
		
			a=s.nextInt();
			b=s.nextInt();
		
		System.out.println("Ans is "+ (a+b));
	}

}
