
/* find given number is even or odd 
 */

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		if(num==0) {
			System.out.println("Enter number is zero");
		}
		else if(num%2==0) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd");
		}
		
	}

}
