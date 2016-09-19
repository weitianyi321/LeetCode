public class SolutionNotGood {
    public int lengthOfLongestSubstring(String s) {
        /*ALGORITHM: 1. 确定一个起始字母，如pwwkew的第三个w。    
            2. 先试试用char temp[1] 存储， 遍历看是否彼此不一样，这时肯定不一样
            3. 用temp[2]试试，一样就跳出循环，不一样继续。一直到一样了或者超出右侧界限为止
            4. 为止以后，测出当前一系列运算返回的substring长度，记录在局部的length（初始化为0）
            5. 起始地点进一，返回2.当进行到4时候，若大于原来的值（第一次肯定大于零所以满足了）
               就存进去，小于就不动了
            6. 所有都完成后return 这个值*******/
        int length = 0;
        char c[] = s.toCharArray();
        // assume the arraylist is abcab
        // i: 初始位置 j:长度 k: 局部用变量
        for (int i = 0; i < c.length; i++) {
            for (int j = 1; j < c.length - i + 1; j++ ) {
                char toExamine []  = new char [j];
                for (int k = i; k < i + j; k ++ ) {

                    toExamine[k - i] = c[k];
                    
                }
                if (length < charArrayLongestSubstring(toExamine))
                        length = charArrayLongestSubstring(toExamine);
                    else
                        continue;

            }
        }

        return length;
    }

    private int charArrayLongestSubstring(char[] c) {
        char [] here = c;
        int returnValue = 0;
        boolean flag = true;
        for (int i = 0; i < c.length; i++ ) {
            for (int j = i + 1; j < c.length; j++ ) {
                if(here[i] != here[j]) {
                    returnValue += 1;
                    continue;}
                if(here[i] == here[j]) {
                    returnValue = 0;
                    flag = false;
                    break;
                }


            }
        }
        if(flag == true)
        return here.length;
        else
        return 0;
    }


    public static void main(String[] args) {
        Solution s = new Solution();

        int rrrr = s.lengthOfLongestSubstring("abcdabcdef");
        System.out.println(rrrr);

    }
}