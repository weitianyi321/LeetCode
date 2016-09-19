public class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null)
			return l2;
		else if(l2 == null)
			return l1;
		else{
			ListNode l3 = mergeTwoNotNullList(l1, l2);
			l3 = l3.next;
			return l3;
		}


	}

	private ListNode mergeTwoNotNullList(ListNode l1, ListNode l2) {
		ListNode l3 = new ListNode(0); //add a dummy ListNode
		ListNode toReturn = l3;
		

		while(l1 != null && l2 != null) {
		if(l1.val <= l2.val) {
			ListNode toBeAdd = new ListNode(l1.val);
		    l3.next = toBeAdd;
		    l3 = l3.next;
		    l1 = l1.next;
		}

		else if(l1.val > l2.val) {
			ListNode toBeAdd = new ListNode(l2.val);
			l3.next = toBeAdd;
			l3 = l3.next;
			l2 = l2.next;
		}


	}
        if(l1 == null && l2 != null) {
            l3.next = l2;
        } else if(l1 != null & l2 == null) {
            l3.next = l1;
        } else {

        }

        return toReturn;
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);

		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);

		Solution s1 = new Solution();
		ListNode l3 = s1.mergeTwoLists(l1, l2);
		while(l3.next != null) {
			System.out.println(l3.val);
			l3 = l3.next;
		}

		
	}
}