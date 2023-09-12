/*
 * Mirror Image Number Pattern

	Input format :
	Integer N (Total no. of rows)
	Output format :
	Pattern in N lines
	Constraints
	0 <= N <= 50
	
	Sample Input 1:
	3
	Sample Output 1:
	      1 
	     12
	    123
	Sample Input 2:
	4
	Sample Output 2:
	      1 
	     12
	    123
	   1234
 */
import java.util.Scanner;

public class MirrorImageNumberPattern {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int space=1; space<=n-i; space++) {
				System.out.print(" ");
			}
			for(int num=1; num<=i; num++) {
				System.out.print(num);
			}
			System.out.println();
		}
		s.close();
	}

}
