/*
 * Print Spiral
 * 
	For a given two-dimensional integer array/list of size (N x M), print 
	it in a spiral form. That is, you need to print in the order followed 
	for every iteration:
	a. First row(left to right)
	b. Last column(top to bottom)
	c. Last row(right to left)
	d. First column(bottom to top)
	 Mind that every element will be printed only once.
	Refer to the Image:
	Spiral path of a matrix
	
	Input format :
	The first line contains an Integer 't' which denotes the number of test 
	cases or queries to be run. Then the test cases follow.
	
	First line of each test case or query contains two integer values, 'N' and 'M', 
	separated by a single space. They represent the 'rows' and 'columns' respectively, 
	for the two-dimensional array/list.
	
	Second line onwards, the next 'N' lines or rows represent the ith row values.
	
	Each of the ith row constitutes 'M' column values separated by a single space.
	Output format :
	For each test case, print the elements of the two-dimensional array/list in the spiral 
	form in a single line, separated by a single space.
	
	Output for every test case will be printed in a seperate line.
	Constraints :
	1 <= t <= 10^2
	0 <= N <= 10^3
	0 <= M <= 10^3
	Time Limit: 1sec
	Sample Input 1:
	1
	4 4 
	1 2 3 4 
	5 6 7 8 
	9 10 11 12 
	13 14 15 16
	Sample Output 1:
	1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
	Sample Input 2:
	2
	3 3 
	1 2 3 
	4 5 6 
	7 8 9
	3 1
	10
	20
	30
	Sample Output 2:
	1 2 3 6 9 8 7 4 5 
	10 20 30 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintSpiral {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int[][] take2DInput() throws IOException {
		String[] strRowsCols = br.readLine().trim().split("\\s");
		int n_rows = Integer.parseInt(strRowsCols[0]);
		int m_cols = Integer.parseInt(strRowsCols[1]);

		if (n_rows == 0) {
			return new int[0][0];
		}


		int[][] mat = new int[n_rows][m_cols];

		for (int row = 0; row < n_rows; row++) {
			String[] strNums; 
			strNums = br.readLine().trim().split("\\s");

			for (int col = 0; col < m_cols; col++) {
				mat[row][col] = Integer.parseInt(strNums[col]);
			}
		}

		return mat;
	}


	public static void main(String[] args) throws NumberFormatException, IOException {
		int t = Integer.parseInt(br.readLine().trim());

		while(t > 0) {

			int[][] mat = take2DInput();

			spiralPrint(mat);
			System.out.println();

			t -= 1;
		}
	}


	private static void spiralPrint(int[][] mat) {
		if(mat.length==0){
			return;
		}
		int row= mat.length;
		int col= mat[0].length;
		int count=0;
		int rowStart=0;
		int rowEnd=row-1;
		int colStart=0;
		int colEnd=col-1;

		while(count<(row*col)) {
			
//		Don't use <= because count is initialize to 0 and
//		if you use = it will enter one more time in loop
//		count<(row*col) &&	this condition is to check pointer at each step
			for(int i=colStart; count<(row*col) && i<=colEnd; i++) {
				System.out.print(mat[rowStart][i]+" ");
				count++;
			}
			rowStart++;
			for(int i=rowStart; count<(row*col) && i<=rowEnd; i++) {
				System.out.print(mat[i][colEnd]+" ");	
				count++;
			}
			colEnd--;
			for(int i=colEnd; count<(row*col) && i>=colStart; i--) {
				System.out.print(mat[rowEnd][i]+" ");	
				count++;
			}
			rowEnd--;
			for(int i=rowEnd; count<(row*col) && i>=rowStart; i--) {
				System.out.print(mat[i][colStart]+" ");
				count++;
			}
			colStart++;
		}

	}
}