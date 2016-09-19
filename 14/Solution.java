public class Solution {
	public String longestCommonPrefix(String[] strs) {
		String toReturn = "";
		//boolean isItStopNow = false;
		boolean flag = true;
		int number = 0;

		if(strs.length == 0 || strs == null) {
			return "";
		} else if(strs.length == 1) {
			return strs[0];
		} else {
			int length = min(strs);
			for (int i = 0; i < length; i++) {
				for (int j = 1; j < strs.length; j++) {
					number = j;
					flag = true;
					if (strs[j].charAt(i) != strs[j - 1].charAt(i)) {
						flag = false;
						break;
					}
				}
				if (flag == true)
					toReturn += strs[number].charAt(i);
				else
					break;


			}
		}

		return toReturn;

	}

	public int min(String[] strs) {

		int size = strs[0].length();
		for (int i = 0; i < strs.length ; i ++ ) {

			if(strs[i].length() < size)
				size = strs[i].length();

		}

		return size;

	}
	public static void main(String[] args) {
		Solution s1 = new Solution();
		String[] r = {"b", "cb", "cab"};
		String test = s1.longestCommonPrefix(r);
		System.out.println(test);

	}


}