/*
 *Star Pattern
 

	Print the following pattern
	Pattern for N = 4
	    *
	   *** 
	  *****
	 *******
	The dots represent spaces.
	
	Input Format :
	N (Total no. of rows)
	Output Format :
	Pattern in N lines
	Constraints :
	0 <= N <= 50
	
	Sample Input 1 :
	3
	Sample Output 1 :
	   *
	  *** 
	 *****
	Sample Input 2 :
	4
	Sample Output 2 :
	    *
	   *** 
	  *****
	 *******
 */
import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		 int n= s.nextInt();
		 
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
		 
		 s.close();
	}

}