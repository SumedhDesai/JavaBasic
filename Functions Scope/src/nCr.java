/*
 * calculate nCr
 */
import java.util.Scanner;

public class nCr {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r = s.nextInt();
		
		int nFact = fact(n);
		int rFact = fact(r);
		int nrFact = fact(n-r);
		
		int ans = nFact/(rFact*nrFact);
		
		System.out.println(ans);
		s.close();
		
		
	}

	private static int fact(int n) {
		int facto=1;
		for(int i= 1; i<=n; i++) {
			facto=facto*i;
		}
		return facto;
	}

}
