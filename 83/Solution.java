import java.util.*;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        ListNode slow = dummy;
        dummy.next = head;
        ListNode fast = dummy.next;

        while (fast.next != null) {
            while (fast.next != null && fast.val == fast.next.val) {
                fast = fast.next;
            }
            if (slow.next != fast) {
                slow.next = fast;
            }
            else {
                fast = fast.next;
                slow = slow.next;
            }
        }
        return dummy.next;
    }
}