public class Solution {
	public boolean canJump(int[] A) {
    int max = 0;
    for(int i=0;i<A.length;i++){
        if(i>max) {return false;}
        max = Math.max(A[i]+i,max);
        System.out.println("max " + i + ":" + max );
    }
    return true;
}
	public static void main(String[] args) {
		Solution s1 = new Solution();
		int a[] = {6,0,1,2,4,7,1,2,0,0,4,7,6,2,1,1,1,0,9};
		boolean j = s1.canJump(a);
		System.out.println(j);
	}
}