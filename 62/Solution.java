public class Solution {
	public ListNode rotateRight(ListNode head, int k) {
		// Calculate the total length of the linkedlist
		int len = 1;
		ListNode realHead = head; // doing a backup
		while (head.next != null) {
			head = head.next;
			len += 1;
		}

		ListNode willBeHead = realHead; // Cause head has actually been place in the rear
		for (int i = 0; i < len - k ; i++) {
			willBeHead = willBeHead.next;
		}

		head.next = realHead;

		return willBeHead;
	}
}