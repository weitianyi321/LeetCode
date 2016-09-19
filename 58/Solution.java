public class Solution {
    public int lengthOfLastWord(String s) {
    	//char[] a = s.toCharArray();
    	int len = s.length();
    	int toReturn = 0;
    	int theLastLength = 0;
    	int totalFrontSpace = 0;
    	int startIndex = 0;
    	
    	if (s.length() < 1) 
    		return 0;
    	else {
    		if(s.charAt(0) == ' ') {
    		startIndex = 1;
    	} else {
    		startIndex = 0;
    	}
    	

       

    	for (int i = startIndex; i < len ; i++ ) {
    		//int toReturn = 0;
    		
    		if (s.charAt(i) != ' ') 
    			toReturn += 1;
    		else if(s.charAt(i) == ' ' && s.charAt(i - 1) != ' ') {
    			theLastLength = toReturn;
    			toReturn = 0;
    		} 
    		else if(s.charAt(i) == ' ' && s.charAt(i - 1) == ' ') {
    			toReturn = 0;
    		}


    	}

    	if(s.charAt(len - 1) == ' ') {
    		toReturn = theLastLength;
    	}}
    	return toReturn;
    }
        
    

    public static void main(String[] args) {
    	Solution s1 = new Solution();
    	int length = s1.lengthOfLastWord(" a");
    	System.out.println(length);

    }

}