/*
 * print isoscale tringle
	  eg : for n=4
	   1
	  121
	 12321
	1234321 
 */

import java.util.Scanner;

public class IsoscaleTringleNumber {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		 int n= s.nextInt();
		 
		 for(int i=1; i<=n; i++) {
			 for(int space=1; space<=n-i; space++) {
				 System.out.print(" ");
			 }
			 for(int num1=1; num1<=i; num1++) {
				 System.out.print(num1);
			 }
			 for(int num2=i-1; num2>=1; num2--) {
				 System.out.print(num2);
			 }
			 System.out.println();
		 }
		 
		 s.close();
	}

}
