public class Solution {
	public int reverse(int x) {
		boolean positiveOrNegative = true;
		if (x == -2147483648)
        return 0;
		else if(x < 0)
			positiveOrNegative = false;
		else if(x >= 0) {
            positiveOrNegative = true;
		}
		if(x/10 == 0) 
			return x;
		else{

		int reversed = reversePositive(Math.abs(x));
		if(positiveOrNegative == false) {
			return (0 - reversed);
		} else
		    return reversed;}
	}

	private int reversePositive(int x) {
		int y = Math.abs(x);
		//ArrayList<double> l1 = new ArrayList<>();
		double temp[] = new double[13];
		int total = 1;
		temp[0] = y % 10;
		double toReturn = 0;
		for (int i = 2; i < 15; i++) {
			if(y / Math.pow(10, i - 1) < 1)
				break;
			temp[i - 1] = (y % (Math.pow(10, i)) - y % (Math.pow(10, i - 1)))/Math.pow(10, i - 1);
			total += 1;

		}
		
		for (int i = 0; i < total; i++) {
			if (toReturn != 0 && Integer.MAX_VALUE / toReturn < 10
	                   && Integer.MAX_VALUE / toReturn > -10){
	                       
	                   temp[0] = 0;
	                   toReturn = 0;}
	                   else
			toReturn += temp[total - 1 - i] * Math.pow(10, i);
	
		}

		return (int)toReturn;
	}

	public static void main(String[] args) {
		Solution s1 = new Solution();
		System.out.println(s1.reverse(1563847412));

	}
}

	