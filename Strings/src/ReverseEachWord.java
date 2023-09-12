/*
 * Reverse Each Word

	Aadil has been provided with a sentence in the form of a string as a function 
	parameter. The task is to implement a function so as to print the sentence such 
	that each word in the sentence is reversed.
	Example:
	Input Sentence: "Hello, I am Aadil!"
	The expected output will print, ",olleH I ma !lidaA".
	Input Format:
	The first and only line of input contains a string without any leading and 
	trailing spaces. The input string represents the sentence given to Aadil.
	Output Format:
	The only line of output prints the sentence(string) such that each word in 
	the sentence is reversed. 
	Constraints:
	0 <= N <= 10^6
	Where N is the length of the input string.

	Time Limit: 1 second
	Sample Input 1:
	Welcome to Coding Ninjas
	Sample Output 1:
	emocleW ot gnidoC sajniN
	Sample Input 2:
	Always indent your code
	Sample Output 2:
	syawlA tnedni ruoy edoc
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseEachWord {

	static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

	public static void main (String [] args) throws NumberFormatException, IOException {
		String str = br.readLine();
		if (str != null) {
			str = str.trim ();
		} else {
			str = "";
		}

		String ans = reverseEachWord(str);

		System.out.println(ans);

		ans = reverseEachWord2(str);

		System.out.println(ans);


	}

	public static String reverseEachWord(String input) {

		int start=0;
		int end=0;
		String revWord;
		String revStr="";

		for(int i=0; i<input.length(); i++) {
			revWord="";
			if(input.charAt(i)!=' ') {
				end++;
				continue;
			}

			while(start<end) {
				revWord=input.charAt(start)+revWord;
				start++;
			}
			revStr=revStr+revWord+" ";
			start++;
			end++;
		}
		revWord="";
		while(start<end) {
			revWord=input.charAt(start)+revWord;
			start++;
		}
		revStr=revStr+revWord+" ";
		return revStr;
	}

	public static String reverseEachWord2(String input) {
		int start=0;
		int end=0;
		String revWord;
		String revStr="";

		for(int i=0; i<input.length(); i++) {
			revWord="";
			while(end<input.length() && input.charAt(end)!=' ') {
				end++;
			}

			while(start<end) {
				revWord=input.charAt(start)+revWord;
				start++;
			}
			revStr=revStr+revWord+" ";
			start++;
			end++;
		}
		return revStr;
	}
}




