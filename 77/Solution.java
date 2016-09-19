import java.util.*;

public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combs = new ArrayList<List<Integer>>();
        dfs(combs, new ArrayList<Integer>(), 1, n, k);
        return combs;
    }

    public void dfs(List<List<Integer>> combs, List<Integer> path, int start, int n, int k) {
    	if (k == 0) {
    		combs.add(new ArrayList<Integer>(path));
    		return;
    	} 
    		for (int i = start; i <= n; i++) {
    			path.add(i);
    			dfs(combs, path, i + 1, n, k - 1);
    			path.remove(path.size() - 1);
    		}
    	

    }
}