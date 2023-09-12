/*
 * Remove Consecutive Duplicates

	For a given string(str), remove all the consecutive duplicate characters.
	Example:
	Input String: "aaaa"
	Expected Output: "a"

	Input String: "aabbbcc"
	Expected Output: "abc"
	 Input Format:
	The first and only line of input contains a string without any leading and 
	trailing spaces. All the characters in the string would be in lower case.
	Output Format:
	The only line of output prints the updated string.
	Note:
	You are not required to print anything. It has already been taken care of.
	Constraints:
	0 <= N <= 10^6
	Where N is the length of the input string.

	Time Limit: 1 second
	Sample Input 1:
	aabccbaa
	Sample Output 1:
	abcba
	Sample Input 2:
	xxyyzxx
	Sample Output 2:
	xyzx
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class RemoveConsecutiveDuplicates {

	static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

	public static void main (String [] args) throws NumberFormatException, IOException {
		String str = br.readLine();
		if (str != null) {
			str = str.trim ();
		} else {
			str = "";
		}

		String ans = removeConsecutiveDuplicates(str);

		System.out.println(ans);

	}

	private static String removeConsecutiveDuplicates(String str) {

		if(str.length()==0) {
			return str;
		}

		String ans= "";
		int i=0;

		while(i<str.length()) {
			char unq=str.charAt(i);
			int unqIndex=i+1;
			while(unqIndex<str.length()&&str.charAt(unqIndex)==unq) {
				unqIndex++;
			}
			ans+=str.charAt(i);
			i=unqIndex;
		}

		return ans;
		
		//	answer by converting string to char array
		
		//		 char[] S=str.toCharArray();
		//	        int n = S.length;
		//	        String str1="";
		//	        if (n < 2)
		//	        {
		//	            return str;
		//	        }
		//	        int j = 0;
		//	        S[j]=S[0];
		//	        for (int i = 1; i < n; i++)
		//	        {
		//
		//	            if (S[j] != S[i])
		//	            {
		//	                j++;
		//	                S[j] = S[i];
		//	            }
		//	        }
		//	        for(int k=0; k<=j; k++){
		//	            // System.out.print(S[k]);
		//	            str1=str1+S[k];
		//	        }
		//	        return str=str1 ;
	}
}

