public class Solution {
    public void sortColors(int[] nums) {
        //red0 white1 blue2
        int redNum = 0;
        int whiteNum = 0;
        int blueNum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) redNum++;
            else if (nums[i] == 1) whiteNum++;
            else blueNum++;
        }
        
        for (int i = 0; i < redNum; i++) nums[i] = 0;
        
        for (int i = redNum; i < redNum + whiteNum; i++) nums[i] = 1;
        
        for (int i = redNum + whiteNum; i < nums.length; i++) nums[i] = 2;
    }
}