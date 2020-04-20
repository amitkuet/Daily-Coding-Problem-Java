package daily.coding.n65;

/**
 * Given a N by M matrix of numbers, print out the matrix in a clockwise spiral.
 * 
 * For example, given the following matrix:
 * [[1, 2, 3, 4, 5], [6, 7, 8, 9, 10], [11, 12, 13, 14, 15], [16, 17, 18, 19,
 * 20]]
 * 
 * You should print out the following:
   1 2 3 4 5 10 15 20 19 18 17 16 11 6 7 8 9 14 13 12
 */
public class Solution {

	private static void printSpiralMatrix(int[][] matrix) {
		int left = 0;
		int right = matrix[0].length - 1;
		int top = 0;
		int down = matrix.length - 1;
		int noOfElements = matrix.length * matrix[0].length;

		while (noOfElements >= 1) {
			// print left to right
			for (int i = left; i <= right; i++) {
				System.out.print(matrix[top][i] + " ");
				noOfElements--;
			}
			top++;

			// print top to down
			for (int i = top; i <= down; i++) {
				System.out.print(matrix[i][right] + " ");
				noOfElements--;
			}
			right--;

			// print right to left
			for (int i = right; i >= left; i--) {
				System.out.print(matrix[down][i] + " ");
				noOfElements--;
			}
			down--;

			// print down to top
			for (int i = down; i >= top; i--) {
				System.out.print(matrix[i][left] + " ");
				noOfElements--;
			}
			left++;
		}
	}

	public static void main(String[] args) {
		int[][] matrix = { 
					{ 1,  2,  3,  4,  5 }, 
					{ 6,  7,  8,  9,  10 }, 
					{ 11, 12, 13, 14, 15 }, 
					{ 16, 17, 18, 19, 20 } 
				};
		printSpiralMatrix(matrix);
	}

}
