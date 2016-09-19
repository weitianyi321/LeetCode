public class Solution {
    double res = 1;
    

    public double myPow(double x, int n) {  
        double base = x;
        int exp = n;
        if (x == 0) return 0;
        else if (x != 0 && n == 0) return 1;   
        else if (n < 0) {
            if(n == Integer.MIN_VALUE) {
                n++; // Make -2147483648 to -2147483647
                exp = n;
                if(x < 0) {
                    x = -x; //we made n odd so need to update sign
                    base = x;
                }
            }
            exp = 0 - exp;   
            res = 1 / myPowHelper(base, exp);
        }  
        else res = myPowHelper(base, exp);
        return res;
    }

    private double myPowHelper(double x, int n) {
        
        if (n % 2 != 0 & n != 1) res = x * myPowHelper(x * x, (n - 1)/2);
        else if (n % 2 == 0) res = myPowHelper(x * x, n / 2);
        else if (n == 1) res = x;
        return res;
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        double a = s1.myPow(2.2223, -7);
        System.out.println(a);
    }
}