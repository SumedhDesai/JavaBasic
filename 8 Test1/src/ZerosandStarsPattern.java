/*
 * Zeros and Stars Pattern

	Print the following pattern
	Pattern for N = 4
	*000*000*
	0*00*00*0
	00*0*0*00
	000***000
	Input Format :
	N (Total no. of rows)
	Output Format :
	Pattern in N lines
	Sample Input 1 :
	3
	Sample Output 1 :
	*00*00*
	0*0*0*0
	00***00
	Sample Input 2 :
	5
	Sample Output 2 :
	*0000*0000*
	0*000*000*0
	00*00*00*00
	000*0*0*000
	0000***0000
 */
import java.util.Scanner;

public class ZerosandStarsPattern {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		int n =s.nextInt();

		for(int i=1; i<=n; i++) {
			for(int zero1=i-1; zero1>=1; zero1--) {
				System.out.print("0");
			}
			System.out.print("*");
			for(int zero2=n-i; zero2>=1; zero2--) {
				System.out.print("0");
			}
			System.out.print("*");
			for(int zero1=n-i; zero1>=1; zero1--) {
				System.out.print("0");
			}
			System.out.print("*");
			for(int zero2=i-1; zero2>=1; zero2--) {
				System.out.print("0");
			}
			System.out.println();
		}
//		 for(int i=1; i<=n; i++) {
//	            for(int j=1; j<=n; j++) {
//	                if(i==j) {
//	                    System.out.print("*");
//	                }else {
//	                    System.out.print("0");
//	                }
//	            }
//	            System.out.print("*");
//	            for(int j=n; j>=1; j--) {
//	                if(i==j) {
//	                    System.out.print("*");
//	                }else {
//	                    System.out.print("0");
//	                }
//	            }
//	            System.out.println();
//	        }

		s.close();
	}
}