public class Solution {
	public String multiply(String num1, String num2) {
		int[] res = new int[num1.length() + num2.length()];
		for (int i = num1.length() - 1; i >= 0; i--) {
			for (int j = num2.length() - 1; j >= 0 ; j--) {
				int d1 = num1.charAt(i) - '0';
				int d2 = num2.charAt(j) - '0';
				res[i + j + 1] += d1 * d2;
			}
		
		}

		/* proceed calculation to the array that has just been created */
		int carry = 0;
		for (int i = res.length - 1; i >= 0; i--) {
			int tmp = (res[i] + carry) % 10;
			carry = (res[i] + carry) / 10;
			res[i] = tmp;
		}

		StringBuilder sb = new StringBuilder();
        for (int num : res) sb.append(num);
        while (sb.length() != 0 && sb.charAt(0) == '0') sb.deleteCharAt(0);
        return sb.length() == 0 ? "0" : sb.toString();



	}

	public static void main(String[] args) {
		Solution s1 = new Solution();
		String a = s1.multiply("123", "123");
		System.out.println(a);
	}
}