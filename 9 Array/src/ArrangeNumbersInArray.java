/*
 * Arrange Numbers In Array

	You have been given an empty array(ARR) and its size N. The only input taken from the user 
	will be N and you need not worry about the array.
	Your task is to populate the array using the integer values in the range 1 to N(both inclusive) 
	in the order - 1,3,.......4,2.
	Note:
	You need not print the array. You only need to populate it.
	Input Format :
	The first line contains an Integer 't' which denotes the number of test cases or queries to be run. 
	Then the test cases follow.
	
	The first and the only line of each test case or query contains an integer 'N'.
	Output Format :
	For each test case, print the elements of the arra/listy separated by a single space.
	
	Output for every test case will be printed in a separate line.
	Constraints :
	1 <= t <= 10^2
	0 <= N <= 10^4
	
	Time Limit: 1sec
	Sample Input 1 :
	1
	6
	Sample Output 1 :
	1 3 5 6 4 2
	Sample Input 2 :
	2
	9
	3
	Sample Output 2 :
	1 3 5 7 9 8 6 4 2
	1 3 2
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrangeNumbersInArray {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            arrange(arr, n);
            printArray(arr);

            t -= 1;
        }
    }

	public static void arrange(int[] arr, int n) {
		int num=1;
		for(int i=0, j=n-1; j>=i; i++,j--) {
			arr[i]=num++;
			if(j!=i) {
			arr[j]=num++;
			}
		}
	}
}