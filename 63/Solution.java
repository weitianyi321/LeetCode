public class Solution {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		if (obstacleGrid[0][0] == 1) return 0;
		else obstacleGrid[0][0] = 1;
		// first column and first row
		int xNum = obstacleGrid[0].length;
		int yNum = obstacleGrid.length;

		for (int i = 1; i < xNum; i++) {
			obstacleGrid[0][i] = 1 - obstacleGrid[0][i];
		}
		for (int i = 1; i < xNum; i++) {
			obstacleGrid[0][i] = obstacleGrid[0][i - 1] * obstacleGrid[0][i];
		}


		for (int i = 1; i < yNum; i++) {
			obstacleGrid[i][0] = 1 - obstacleGrid[i][0];
		}
		for (int i = 1; i < yNum; i++) {
			obstacleGrid[i][0] = obstacleGrid[i - 1][0] * obstacleGrid[i][0];		
		}

		for (int i = 1; i < xNum; i++) {
			for (int j = 1; j < yNum; j++) {
				if (obstacleGrid[j][i] == 1) obstacleGrid[j][i] = 0;
				else {
					obstacleGrid[j][i] = obstacleGrid[j - 1][i] + obstacleGrid[j][i - 1];
				}
			}
		}



		return obstacleGrid[yNum - 1][xNum - 1];
	}
	
}