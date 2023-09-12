/*
 * Half Diamond Pattern

	Write a program to print N number of rows for Half Diamond pattern using stars and numbers
	Note : There are no spaces between the characters in a single line.
	
	Input Format :
	A single integer: N
	Output Format :
	Required Pattern
	Constraints :
	0 <= N <= 50
	
	Sample Input 1 :
	3
	Sample Output 1 :
	*
	*1*
	*121*
	*12321*
	*121*
	*1*
	*
	Sample Input 2 :
	 5
	Sample Output 2 :
	*
	*1*
	*121*
	*12321*
	*1234321*
	*123454321*
	*1234321*
	*12321*
	*121*
	*1*
	*
 */

import java.util.Scanner;

public class HalfDiamondPattern {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		
		System.out.println("*");
		
		for(int i=1; i<=n; i++) {
			System.out.print("*");
			int num1;
			for(num1=1; num1<=i; num1++) {
				System.out.print(num1);
			}
			num1--;
			for(int num2=1; num2<=i-1; num2++) {
				num1--;
				System.out.print(num1);
			}
			System.out.print("*");
			System.out.println();
		}
		
		for(int j=1; j<=n-1; j++) {
			System.out.print('*');
			int num1;
			for(num1=1; num1<=n-j; num1++) {
				System.out.print(num1);
			}
			num1--;
			for(int num2=1; num2<=n-j-1; num2++) {
				num1--;
				System.out.print(num1);
			}
			System.out.print("*");
			System.out.println();
		}
		System.out.println("*");
		s.close();
	}

}
