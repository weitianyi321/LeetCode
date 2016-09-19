import java.util.*;

public class Solution {
	/* Combination Sum 2*/
	List<List<Integer>> res = new ArrayList<List<Integer>> ();

	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		Arrays.sort(candidates);
		List<Integer> path = new ArrayList<Integer>();
		dfs_com(candidates, target, 0, path);
		return res;
		

	}

	void dfs_com(int[] cand, int target, int cur, List<Integer> path) {
		if(target == 0) {
			res.add(new ArrayList(path));
			return;
		}
		if(target < 0) {
			return;
		}
		for (int i = cur; i < cand.length; i++) {
			if(i > cur && cand[i] == cand[i - 1]) continue;
			path.add(path.size(), cand[i]);
			dfs_com(cand, target - cand[i], i + 1, path);
			path.remove(path.size() - 1);
		}

	}
}