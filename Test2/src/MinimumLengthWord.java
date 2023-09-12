/*
 * Minimum Length Word

	Given a string S (that can contain multiple words), you need to find the word which has minimum length.
	Note : If multiple words are of same length, then answer will be first minimum length word in the string.
	Words are seperated by single space only.
	Input Format :
	String S
	Output Format :
	Minimum length word
	Constraints :
	1 <= Length of String S <= 10^5
	Sample Input 1 :
	this is test string
	Sample Output 1 :
	is
	Sample Input 2 :
	abc de ghihjk a uvw h j
	Sample Output 2 :
	a
 */
import java.util.Scanner;

public class MinimumLengthWord {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		System.out.println(minLengthWord(str));
		s.close();
	}

	private static String minLengthWord(String str) {
		int minWord=Integer.MAX_VALUE;
		String ans="";
		int start=0;
		int end=0;
		while(start<str.length()) {
			
			while(end<str.length() && str.charAt(end)!=' ') {
				end++;
			}
			int wordLength=end-start;
			
			if(wordLength<minWord) {
				ans=str.substring(start, end);
				minWord=wordLength;
			}
			end++;
			start=end;
		}
		return ans;
	}

}
