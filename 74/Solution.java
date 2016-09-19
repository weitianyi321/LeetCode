public class Solution {
	public boolean searchMatrix(int[][] matrix, int target) {
	    if  (target < matrix[0][0]) return false;
		int currY = 0;
		boolean res = false;
		if (matrix.length == 1) {
		    for (int i = 0; i < matrix[0].length; i++) {
			if (matrix[0][i] == target) return true;
		}
		return false;
		}
		else {
		    for (int i = 0; i < matrix.length; i++) {
			if (target < matrix[i][0]) {
		    currY = i - 1;	    
			break;
			}
			currY = matrix.length - 1;
		}

		for (int i = 0; i < matrix[0].length; i++) {
			if (matrix[currY][i] == target) return true;

		}

		return false;
		}
	}
	
}