public class Solution {
	double res = 1;
	

	public double myPow(double x, int n) {	
		double base = x;
		int exp = n;
		if (x == 0) return 0;
		else if (x != 0 && n == 0) return 1;		
		else res = myPowHelper(base, exp);
		return res;
	}

	private double myPowHelper(double x, int n) {
		if (n % 2 != 0) res = x * myPowHelper(x * x, (n - 1)/2);
		else if (n % 2 == 0) res = myPowHelper(x * x, n / 2);
		return res;
	}
}