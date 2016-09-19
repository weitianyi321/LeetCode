public class Solution {
	public boolean canJump(int[] nums) {
    int maxIndex = nums.length-1;
    int maxJump  = nums[0];
    for(int i = 0; i <= maxJump; i++){
        maxJump=Math.max(maxJump,i+nums[i]);
        if(maxJump>=maxIndex) return true;
    }
    return false;
}
	public static void main(String[] args) {
		Solution s1 = new Solution();
		int[] a1 = {2, 9, 0, 3, 0, 7};
		System.out.println(s1.canJump(a1));

	}
}