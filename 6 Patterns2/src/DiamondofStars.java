/*
 * Diamond of stars

	Input format :
	N (Total no. of rows and can only be odd)
	Output format :
	Pattern in N lines
	Constraints :
	1 <= N <= 49
	Sample Input 1:
	5
	Sample Output 1:
	  *
	 ***
	*****
	 ***
	  *
	Sample Input 2:
	3
	Sample Output 2:
	  *
	 ***
	  *
 */
import java.util.Scanner;

public class DiamondofStars {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N= s.nextInt();
		int n=N/2+1;

		for(int i=1; i<=n; i++) {
			for(int space=1; space<=n-i; space++) {
				System.out.print(" ");
			}
			
			for(int star1=1; star1<=i; star1++) {
				System.out.print("*");
				
			}
			
			for(int star2=i-1; star2>=1; star2--) {
			
				System.out.print("*");
			}
			System.out.println(); 
		}
		
		for(int j=1; j<=n-1; j++) {
			for(int space=1; space<=j; space++) {
				System.out.print(" ");
			}
			for(int star1=1; star1<=n-j; star1++) {
				System.out.print("*");
				
			}
			
			for(int star2=n-j-1; star2>=1; star2--) {
			
				System.out.print("*");
			}
			System.out.println(); 
		}
		
		s.close();
	}
}
