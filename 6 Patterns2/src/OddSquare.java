/*
 * Odd Square

	Write a program to print the pattern for the given N number of rows.
	For N = 4
	1357
	3571
	5713
	7135
	
	Input Format :
	A single integer: N
	Output Format :
	Required Pattern
	Constraints :
	0 <= N <= 50
	
	Sample Input 1 :
	3
	Sample Output 1 :
	135
	351
	513
	Sample Input 2 :
	 5
	Sample Output 2 :
	13579
	35791
	57913
	79135
	91357
 */
import java.util.Scanner;

public class OddSquare {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int num;
		int start=1;
		for(int i=1; i<=n; i++) {
			num=start;
			for(int j=n-i+1; j>=1; j--) {
				System.out.print(num);
				num=num+2;
			}
			int num1 = 1;
			for(int j=1; j<=i-1; j++) {
				System.out.print(num1);
				num1=num1+2;
			}
			start=start+2;
			System.out.println();
		}
		s.close();
	}
}
