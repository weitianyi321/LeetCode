public class Solution {
	int top,left = 0;
    int bottom, right; // notice that there should be a minus 1
    int[][] res = {};
    public int[][] generateMatrix(int n) {  
        res = new int[n][n];
    	bottom  = n - 1;
    	right  = n - 1;    
        if (n == 1) {
        	res[0][0] = 1;
        	return res;
        } else {
        	generate(res, n);
        	return res;
        }
    }

    private void generate(int[][] res, int n) {
    	int count = 1;
    	while (left <= right && top <= bottom) {
    	for (int i = left; i <= right; i++) {
    		res[top][i] = count;
    		count ++;
    	}
    	top++ ;

    	for (int i = top; i <= bottom; i++) {
    		res[i][right] = count;
    		count ++;
    	}
    	right-- ;

    	for (int i = right ; i >= left; i--) {
    		res[bottom][i] = count;
    		count ++;
    	}
    	bottom-- ;

    	for (int i = bottom; i >= top; i--) {
    		res[i][left] = count;
    		count ++;
    	}
    	left++;
    }
    }
}
