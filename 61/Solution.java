public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        //calculate the total length of the linkedlist array
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        if (head == null || head.next == null) return head;
        int len = 1;
        while (head.next != null) {
        	head = head.next;
        	len = len + 1; 
        }
    
        head.next = dummy.next;
        int n = len - k % len; // n here represents the after index while k larger than len

        ListNode left = head;
        while (n > 0) {
        	left = left.next;
        	n--;
        }

        ListNode right = left.next;
        dummy.next = right;
        left.next = null;
        head = dummy.next;

        return head;

    }
}