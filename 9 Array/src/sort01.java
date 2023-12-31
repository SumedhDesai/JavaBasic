/*
 * Sort 0 1

	You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1. Write a 
	function to sort this array/list. Think of a solution which scans the array/list only once and don't 
	require use of an extra array/list.
	Note:
	You need to change in the given array/list itself. Hence, no need to return or print anything. 
	Input format :
	The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then 
	the test cases follow.
	
	First line of each test case or query contains an integer 'N' representing the size of the array/list.
	
	Second line contains 'N' single space separated integers(all 0s and 1s) representing the elements in the 
	array/list.
	Output format :
	For each test case, print the sorted array/list elements in a row separated by a single space.
	
	Output for every test case will be printed in a separate line.
	Constraints :
	1 <= t <= 10^2
	0 <= N <= 10^5
	Time Limit: 1 sec
	Sample Input 1:
	1
	7
	0 1 1 0 1 0 1
	Sample Output 1:
	0 0 0 1 1 1 1
	Sample Input 2:
	2
	8
	1 0 1 1 0 1 0 1
	5
	0 1 0 1 0
	Sample Output 2:
	0 0 0 1 1 1 1 1
	0 0 0 1 1 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sort01 {

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
			sortZeroesAndOne(input);
			printArray(input);

			t -= 1;
		}
	}

	
	
	
	private static void sortZeroesAndOne(int[] arr) {
//		int i=0;
//		int j=arr.length-1;				this logic is successful for 3 case
//		while(j>i) {					i.e. 0
//			if(arr[i]==0) {				1 1 0 0 1 0 
//				i++;					1 1 0 0 1 0 0 0 0 0 1 
//			}							but failed for other cases 
//			if(arr[j]==1) {				like 1 0 1 0 1 1 1
//				j--;					here when i and j came close and on correct value
//			}							on next iteration i++ and j-- hapend and after 
//			if(arr[i]!=0&&arr[j]!=1) {	swaping take place and then condition 
//				int temp=arr[i];		failed and answer getting is wrong.
//				arr[i]=arr[j];			when two pointer is maintain move 
//				arr[j]=temp;			only one pointer at a time and check 
//			}							condition after that.
//		}
		int i=0;
		int j=arr.length-1;
		while(j>i) {
			if(arr[i]==0) {
				i++;
				continue;
			}
			if(arr[j]==1) {
				j--;
				continue;
			}

			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;

		}
	}
}
