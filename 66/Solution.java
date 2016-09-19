public class Solution {
	public int[] plusOne(int[] digits) {
		int length = digits.length;
		int count = 0;
		for (int i = length - 1; i > -1; i--) {
			if (digits[i] == 9) {
			    digits[i] = 0;
			}
			else {
			digits[i] = digits[i] + 1;
			return digits;
			}

		}

		int [] newOne = new int[length + 1];
		newOne[0] = 1;
		return newOne;
	}

	
}