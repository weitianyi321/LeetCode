public class Solution {
    
    public static int[] twoSum(int[] nums, int target) {
        int toReturn [] = {0, 0};
        boolean ifFound = false;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j ++) {
                if ( nums[i] + nums [j] == target )  {
                     toReturn [0] =  i;
                     toReturn [1] =  j;
                    ifFound = true;
                   
                }

                 else continue;
            }
        }

        if(ifFound == true){
        
        return toReturn;}
        else 
            { return null;}
    }

    
    
}