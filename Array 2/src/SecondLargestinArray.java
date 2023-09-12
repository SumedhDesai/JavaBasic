/*
 * Second Largest in array

	You have been given a random integer array/list(ARR) of size N. You are required to find and return 
	the second largest element present in the array/list.
	If N <= 1 or all the elements are same in the array/list then return -2147483648 or -2 ^ 31(It is the 
	smallest value for the range of Integer)
	Input format :
	The first line contains an Integer 't' which denotes the number of test cases or queries to be run. 
	Then the test cases follow.
	
	The first line of each test case or query contains an integer 'N' representing the size of the array/list.
	
	The second line contains 'N' single space separated integers representing the elements in the array/list.
	Output Format :
	For each test case, print the second largest in the array/list if exists, -2147483648 otherwise.
	
	Output for every test case will be printed in a separate line.
	Constraints :
	1 <= t <= 10^2
	0 <= N <= 10^5
	
	Time Limit: 1 sec
	Sample Input 1:
	1
	7
	2 13 4 1 3 6 28
	Sample Output 1:
	13
	Sample Input 2:
	1
	5
	9 3 6 2 9
	Sample Output 2:
	6
	Sample Input 3:
	2
	2
	6 6
	4
	90 8 90 5
	Sample Output 3:
	-2147483648
	8
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondLargestinArray {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }
        
        String[] strNums; 
        strNums = br.readLine().split("\\s");
        

        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] input = takeInput();
            int ans = secondLargestElement(input);
            System.out.println(ans);

            t -= 1;
        }
    }

	private static int secondLargestElement(int[] arr) {
		int l=Integer.MIN_VALUE;
		int s=Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>l) {
				s=l;
				l=arr[i];
//				while checking arr[i] & number is between updated l and s then to update s e.g. 2 3 7 9 8 9
			}else if(arr[i]>s && arr[i]!=l) {
				s=arr[i];
			}
		}
		return s;
	}
}