/*
 * Reverse String Wordwise

	Reverse the given string word wise. That is, the last word in
	given string should come at 1st place, last second word at 2nd 
	place and so on. Individual words should remain as it is.
	Input format :
	String in a single line
	Output format :
	Word wise reversed string in a single line
	Constraints :
	0 <= |S| <= 10^7
	where |S| represents the length of string, S.
	Sample Input 1:
	Welcome to Coding Ninjas
	Sample Output 1:
	Ninjas Coding to Welcome
	Sample Input 2:
	Always indent your code
	Sample Output 2:
	code your indent Always
 */
import java.util.Scanner;

public class ReverseStringWordwise {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(reverseWordWise(input));
		s.close();
	}

	public static String reverseWordWise(String input) {
		int start=0;
		int end=0;
		String word;
		String revStr="";

		for(int i=0; i<input.length(); i++) {
			word="";
			if(input.charAt(i)!=' ') {
				end++;
				continue;
			}

			while(start<end) {
				word=word+input.charAt(start);
				start++;
			}
			revStr=word+" "+revStr;
			start++;
			end++;
		}
		word="";
		while(start<end) {
			word=word+input.charAt(start);
			start++;
		}
		revStr=word+" "+revStr;
		start++;
		end++;
		return revStr;
		
		
//  	word is created by substring.		
//		int start=0;
//		int end=0;
//		String word;
//		String revStr="";
//
//		for(int i=0; i<input.length(); i++) {
//			word="";
//			if(input.charAt(i)!=' ') {
//				end++;
//				continue;
//			}
//
//			word=input.substring(start, end);
//			revStr=word+" "+revStr;
//			end++;
//			start=end;
//		}
//		word="";
//		word=input.substring(start, end);
//		revStr=word+" "+revStr;
//		end++;
//		start=end;
//
//		return revStr;
		
		
	}

}



