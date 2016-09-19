public class Solution {
	public int removeDuplicates(int[] nums) {
		int i = 0;
		for (int n : nums) {
			if (i < 2 || n > nums[i - 2]) {
				nums[i] = n;
				i++;
			}
		}
		return i;
	}

	public static void main(String[] args) {
		Solution s1 = new Solution();
		int[] a = {1,1,2,3,4,5,6,6,7,8,8,8,9};
		int b = s1.removeDuplicates(a);
		System.out.println(b);
	}
}