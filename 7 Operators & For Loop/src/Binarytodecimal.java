/*
 * Binary to decimal

	Given a binary number as an integer N, convert it into decimal and print.
	Input format :
	An integer N in the Binary Format
	Output format :
	Corresponding Decimal number (as integer)
	Constraints :
	0 <= N <= 10^9
	Sample Input 1 :
	1100
	Sample Output 1 :
	12
	Sample Input 2 :
	111
	Sample Output 2 :
	7
 */
import java.util.Scanner;

public class Binarytodecimal {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		int num=0;
		
		for(int i=0; n!=0; i++) {
			int dig=n%10;
			num= num+(int) (dig*(Math.pow(2,i)));
			n=n/10;
		}
		System.out.println(num);
		s.close();
	}

}
