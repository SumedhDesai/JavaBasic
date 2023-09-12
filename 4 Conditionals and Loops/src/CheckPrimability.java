/* check number is prime or not
 * 
 */
import java.util.Scanner;

public class CheckPrimability {

	public static void main(String[] args) {
		int n;
		
		Scanner s = new Scanner(System.in);
		n= s.nextInt();
		
		int div = 2;
//		                             for optimization
//		while(div<=n/2);             factors of any number present only before n/2
//		while(div<=Math.sqrt(n));    small factor of any number is present only before sqrt on n
		
		while(div<n) {
			if(n%div==0) {
				System.out.println("not prime");
				return;
			}
			div++;
		}
		System.out.println("prime");
	}

}
