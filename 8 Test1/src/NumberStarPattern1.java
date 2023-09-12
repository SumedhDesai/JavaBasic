/*
 * Number Star pattern 1

	Print the following pattern for given number of rows.
	Input format :
	Integer N (Total number of rows)
	Output Format :
	Pattern in N lines
	Sample Input :
	   5
	Sample Output :
	 5432*
	 543*1
	 54*21
	 5*321
	 *4321
 */
import java.util.Scanner;

public class NumberStarPattern1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int num1=n; num1>i; num1--) {
				System.out.print(num1);
			}
			System.out.print("*");
			for(int num2=i-1; num2>=1; num2--) {
				System.out.print(num2);
			}
			System.out.println();
		}
//		
//		 int i, j;
//	        for(i=1; i<=n; i++) {
//	            for(j=n; j>=1; j--) {
//	                if(j==i) {
//	                    System.out.print("*");
//	                }else {
//	                    System.out.print(j);
//	                }
//	            }
//	            System.out.println();
//	        }
		s.close();
	}
}
