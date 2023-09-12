/*
 * Square Root (Integral)
  
	Given a number N, find its square root. You need to find and print only the integral part of square root of N.
	For eg. if number given is 18, answer is 4.
	Input format :
	Integer N
	Output Format :
	Square root of N (integer part only)
	Constraints :
	0 <= N <= 10^8
	Sample Input 1 :
	10
	Sample Output 1 :
	3
	Sample Input 2 :
	4
	Sample Output 2 :
	2
 */
  import java.util.Scanner;

public class SquareRootIntegral {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
		int num=0;
		while(num*num<=n) {
			num++;
		}
		num--;
		System.out.println(num);
		s.close();
		
//		solution 2
//		int sq, sqr=0, i=1;
//		while(true) {
//			sq=i*i;
//			if(sq==n) {
//				System.out.println(i);
//				break;
//			}
//            if(sq>n) {
//				System.out.println(sqr);
//				break;
//			}
//			sqr=i;
//			i++;
//		}
	}

}
