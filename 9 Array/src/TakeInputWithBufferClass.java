/*
 * taking input 
 */
import java.io.*;
import java.util.*;

public class TakeInputWithBufferClass {
	
	public static void printArray(int[] arr) {
		 for(int i=0; i<arr.length; i++) {
			 System.out.println(arr[i]);
		 }
	}
	public static int[] takeInputBufferedReader() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// input stream reader take input byte by byte
        // form source and decode it into character steam 
        // and stored in buffer
        // buffer reader reads from this buffer	
		int size = Integer.parseInt(br.readLine());
		
		 int[] arr = new int[size];
		 
		String[] strNums = br.readLine().split(" ");
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=Integer.parseInt(strNums[i]);
		}
		return arr;
	}
	
	public static int[] takeInputScannerClass() {
		
		Scanner s = new Scanner(System.in);
		 int size= s.nextInt();
		 
		 int[] arr = new int[size];
		 
		 for(int i=0; i<arr.length; i++) {
			 arr[i]= s.nextInt();
		 }
		 s.close();
		 return arr;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int[] arr= takeInputScannerClass();
		int[] arr1= takeInputBufferedReader();
		printArray(arr);
		printArray(arr1);

	}

}

