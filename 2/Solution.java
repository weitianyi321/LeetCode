public class Solution {
	int addFactorFromLast = 0;
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if(l1 == null && l2 != null) {
			return l1;
		} else if(l1 != null && l2 == null) {
			return l2;
		} else if(l1 == null && l2 == null) {
            return null;
		} else if(l1 != null && l2 != null) {
			return addTwoNotNullNumbers(l1, l2);
		} else
		    return null;
	}

	private ListNode addTwoNotNullNumbers(ListNode l1, ListNode l2) {
		
		ListNode p = l1;
		ListNode q = l2;
		ListNode addMover = new ListNode(0); //add a dummy node
		ListNode toReturn = addMover;
		while(p != null && q != null) {
			if(p.val + q.val + addFactorFromLast >= 10) {
				ListNode addMoverNext = new ListNode((p.val + q.val + addFactorFromLast) % 10);
				addMover.next = addMoverNext;
				addFactorFromLast = 1;
				p = p.next;
				q = q.next;
				addMover = addMover.next;
			} else if(p.val + q.val + addFactorFromLast < 10) {
				ListNode addMoverNext = new ListNode(p.val + q.val + addFactorFromLast);
				addMover.next = addMoverNext;
				addFactorFromLast = 0;
				p = p.next;
				q = q.next;
				addMover = addMover.next;

			}

		}   
		if(p == null && q == null) {
			if(addFactorFromLast == 1) {
				ListNode addMoverNext = new ListNode(1);
				addMover.next = addMoverNext;
			} else {

			}

		} else if(p == null) {
			if(q.val + addFactorFromLast < 10){
			ListNode addMoverNext = new ListNode(q.val + addFactorFromLast);
			addMover.next = addMoverNext;
			addMover.next.next = q.next;}
			else if(q.val + addFactorFromLast == 10){
			while(q != null) {
				
				if(q.val + addFactorFromLast == 10){
					ListNode addMoverNext = new ListNode(0);
				    addMover.next = addMoverNext;
				    addMover = addMover.next;
				    q = q.next;
					addFactorFromLast = 1;}
				else{
					
					ListNode addMoverNext = new ListNode(q.val + addFactorFromLast);
					addFactorFromLast = 0;
				    q = q.next;
				    addMover.next = addMoverNext;
				    addMover = addMover.next;

				}

			}
        }
			
		} else if(q == null) {
			if(p.val + addFactorFromLast < 10){
			ListNode addMoverNext = new ListNode(p.val + addFactorFromLast);
			addMover.next = addMoverNext;
			addMover.next.next = p.next;}
			else if(p.val + addFactorFromLast == 10){
			while(p != null) {
				if(p.val + addFactorFromLast == 10){
					ListNode addMoverNext = new ListNode(0);
				    addMover.next = addMoverNext;
				    addMover = addMover.next;
				    p = p.next;
					addFactorFromLast = 1;}
				else if (p.val + addFactorFromLast < 10){
					ListNode addMoverNext = new ListNode(p.val + addFactorFromLast);

					addFactorFromLast = 0;
				    p = p.next;
				    addMover.next = addMoverNext; 
				    addMover = addMover.next;
				}

			}
        }
			
		}
		if(p == null && q == null && addFactorFromLast == 1) {
			ListNode last = new ListNode(1);
			addMover.next = last;
		}
		return toReturn.next;

	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		

		ListNode l2 = new ListNode(9);
		l2.next = new ListNode(8);
		

		Solution s1 = new Solution();
		ListNode l3 = s1.addTwoNumbers(l1, l2);
		while(l3 != null) {
			System.out.println(l3.val);
			l3 = l3.next;
		}
	}
}