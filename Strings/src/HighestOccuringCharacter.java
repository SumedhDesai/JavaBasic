/*
 * Highest Occuring Character

	For a given a string(str), find and return the highest occurring character.
	Example:
	Input String: "abcdeapapqarr"
	Expected Output: 'a'
	Since 'a' has appeared four times in the string which happens to be the 
	highest frequency character, the answer would be 'a'.
	If there are two characters in the input string with the same frequency, 
	return the character which comes first.
	Consider:
	Assume all the characters in the given string to be in lowercase always.
	Input Format:
	The first and only line of input contains a string without any leading and trailing spaces.
	Output Format:
	The only line of output prints the updated string. 
	Note:
	You are not required to print anything explicitly. It has already been taken care of.
	Constraints:
	0 <= N <= 10^6
	Where N is the length of the input string.
	
	Time Limit: 1 second
	Sample Input 1:
	abdefgbabfba
	Sample Output 1:
	b
	Sample Input 2:
	xy
	Sample Output 2:
	x
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HighestOccuringCharacter {

	static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

	public static void main (String [] args) throws NumberFormatException, IOException {
		String str = br.readLine ();
		if (str != null) {
			str = str.trim ();
		} else {
			str = "";
		}

		char ans = highestOccuringChar(str);

		System.out.println(ans);
		
	}

	private static char highestOccuringChar(String str) {
		
		int[] freqency= new int[250];
		
		for(int i=0; i<str.length(); i++) {
			char ch= str.charAt(i);
			freqency[ch]++;
		}
		int large=Integer.MIN_VALUE;
		int index=-1;
		
		for(int i=0; i<freqency.length; i++) {
			if(freqency[i]>large) {
				large=freqency[i];
				index=i;
			}
		}
		char ch= (char)index;	
		
		return ch;
		
//		another way to reduce effort of scanning whole array
//		int n= str.length();
//        int[] arr=new int[256];
//
//        for(int i=0; i<n; i++){
//            arr[str.charAt(i)]++;    
//        }
//        int max=-1;
//        char ch=str.charAt(0);
//
//        for(int i=0; i<n; i++){
//            if(max<arr[str.charAt(i)]){
//                max=arr[str.charAt(i)];
//                ch=str.charAt(i);
//            }
//        }
//        return ch;

	}
}