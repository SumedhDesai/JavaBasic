/*
 * reversing a given word
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseWord {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		String str = br.readLine();
		if (str != null) {
			str = str.trim();
		} else {
			str = "";
		}

		str=reverseWord(str);
		System.out.println(str);
		
	}

	private static String reverseWord(String str) {
		
		String revStr="";
		for(int i=0; i<str.length(); i++) {
			revStr=str.charAt(i)+revStr;
		}
		return revStr;
	}
}