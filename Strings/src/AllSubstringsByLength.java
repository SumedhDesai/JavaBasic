/*
 * print substring by lengthwise
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AllSubstringsByLength {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		String str = br.readLine();
		if (str != null) {
			str = str.trim();
		} else {
			str = "";
		}

		printSubstrings(str);
		
	}

	private static void printSubstrings(String str) {
		
		for(int length=1; length<=str.length(); length++) {
			
			for(int i=0; i<=str.length()-length; i++) {
				int end=i+length;
				System.out.println(str.substring(i, end));
			}
		}
			
	}
}