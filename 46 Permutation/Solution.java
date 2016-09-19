import java.util.*;

public class Solution {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		List<Integer> l0 = new ArrayList<Integer>();
		l0.add(nums[0]);
		ans.add(0, l0);

		for (int i = 1; i <= nums.length - 1; i++) {
			List<List<Integer>> new_ans = new ArrayList<List<Integer>>();

			for (int j = 0; j <= i; j++) {
				for (List<Integer> l : ans) {
					List<Integer> new_l = new ArrayList<Integer>(l);
					new_l.add(j, nums[i]);
					new_ans.add(new_l);
					
				}

			}
			ans = new_ans;
		}

		return ans;
	}
}