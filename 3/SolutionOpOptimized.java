import java.util.Map;
import java.util.HashMap;

public class SolutionOpOptimized {
	/* 1.比如给定abcdedhjkl这个字符串。当比较完abcde，开始比较下一个“d”的时候，发现不满足，这时候只需要
	 * 把i推后到e开始比较就好了，因为加入i在e前面再怎么比也会包括那个重复的两个d。下一步从e开始比五个字母
	   2. 容易想到的在此基础上的优化方法，是直接把j也往后拖动i刚刚拖动的步数，但这样就无法读入hashmap，所以应该不行
	   吧*/

    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; ++j) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }

}