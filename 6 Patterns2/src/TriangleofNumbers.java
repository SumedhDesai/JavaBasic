/*
 * Triangle of Numbers

	Print the following pattern for the given number of rows.
	Pattern for N = 4
	          1
	         232
	        34543
	       4567654

	Input format :
	Integer N (Total no. of rows)
	Output format :
	Pattern in N lines
	Constraints :
	0 <= N <= 50
	
	Sample Input 1:
	5
	Sample Output 1:
	           1
	          232
	         34543
	        4567654
	       567898765
	Sample Input 2:
	4
	Sample Output 2:
	           1
	          232
	         34543
	        4567654
 */
import java.util.Scanner;
public class TriangleofNumbers {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		for(int i=1; i<=n; i++) {
			for(int space=1; space<=n-i; space++) {
				System.out.print(" ");
			}
			int num1=i;
			for(int j=1; j<=i; j++) {
				System.out.print(num1);
				num1++;
			}
			num1--;
			for(int k=i-1; k>=1; k--) {
				num1--;
				System.out.print(num1);
			}
			System.out.println(); 
			s.close();
		}	
	}
}