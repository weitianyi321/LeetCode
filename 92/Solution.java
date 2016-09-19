/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        //e.g. 1-2-3-4-5
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode rightLinkPrev = head; //rightLink points to head
        ListNode leftLink = dummy; //leftLink points to dummy
        for (int i = 0; i < n - 1; i++) 
            rightLinkPrev = rightLinkPrev.next; //here rightLinkPrev -> 4
        ListNode rightLinkPrevBackUp = rightLinkPrev; //to be linked by leftLink
        ListNode rightLink = rightLinkPrev.next; //here rightLink -> 5
        for (int j = 0; j < m - 1; j++) leftLink = leftLink.next;
        
        //leftLink.next = rightLinkPrev; //1-->4, should be proceeded after reversion

        /* Here try to reverse the linkedlist thoroughly*/
        for (int i = 0; i < n - m; i++) {  // n - m = 2, only 2 operation needed
            ListNode newOne = leftLink; // create a pointer each time 
            int moveForwardCount = n - m - i; // 2, 1
            while (moveForwardCount > 0) {
                newOne = newOne.next; // newOne goes beyond to be linked 3, 2
                moveForwardCount--;
               
            }
             rightLinkPrev.next = newOne;
                rightLinkPrev = newOne;
        } 

        leftLink.next = rightLinkPrevBackUp;
        rightLinkPrev.next = rightLink;

        return dummy.next;
    }
}