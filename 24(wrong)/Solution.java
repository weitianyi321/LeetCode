public class Solution {
	public ListNode swapPairs(ListNode l) {
		if(l == null)
			return null;
		else if (l.next == null)
			return l;
		else {
			return swapNotNullPairs(l);
		}

	}

	private ListNode swapNotNullPairs(ListNode l) {

		ListNode dummy = new ListNode(0);
		dummy.next = l.next;
		ListNode p = l;

		while(p.next!= null) { //第二次直接跳出了.原因是第一次的指针指向了第三个，第三个还给变成了第四个
			ListNode nextPair = p.next.next;
			System.out.println(p.val);

			p.next.next = p;
			p.next = nextPair;


			if(nextPair != null) {
				p = p.next.next;
				System.out.println("jump once");

			} else
				break;
		}
		return dummy.next;
	}

	public static void main(String[] args) {
		Solution s1 = new Solution();
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		l1.next.next.next = new ListNode(4);
		ListNode l3 = s1.swapPairs(l1);


		System.out.println(l3.val );
		System.out.println(l3.next.val );
		System.out.println(l3.next.next.val);
		System.out.println(l3.next.next.next.val);
	}


}