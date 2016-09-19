import java.util.*;

public class Solution {
	public String simplifyPath(String path) {
		Set<String> duplicates = new HashSet<String>();
		Deque<String> stack = new LinkedList<String>();
		String res = "";
		duplicates.add("");
		duplicates.add(".");
		duplicates.add("..");
		for (String each : path.split("/")) {
			if (each.equals("..") && !stack.isEmpty()) {
				stack.pop();
			} else if (duplicates.contains(each) != true) {
				stack.push(each);
			}
		}

		for (String r : stack) {
			res = "/" + r + res;
		}
		return res.isEmpty() ? "/" : res;
	}
	public static void main(String[] args) {
		Solution s1 = new Solution();
		String b = s1.simplifyPath("/apple/apple/bubble/cat/.././");
		System.out.println(b);
	}
}