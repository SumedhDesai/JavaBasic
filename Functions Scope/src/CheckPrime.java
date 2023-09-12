/*
 * check number is prime or not by function.
 */
import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		
		System.out.println(isPrime(n));
		s.close();
	}

	private static boolean isPrime(int n) {
		
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
