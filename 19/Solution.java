public class Solution {
	/* A very important issue here is how to initialize the Solution function without using the
	   Solution constructor. Using the ListNode class only is good
	   WE DO NOT NEED THE IN_SIDE CLASS ListNode inside the class "Solution"*/






    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head;
        int lengthOfList = getLength(head);
        if(head == null || lengthOfList < n) {
            return null;
        } else if (lengthOfList == 1) {
            ListNode left = moveFowardNTimes(head, lengthOfList - 2);
            left.next = null;
            return null;
        } else if (lengthOfList == n) {
            p = p.next;
            return p;
        } else if (lengthOfList > n) {
            ListNode left = moveFowardNTimes(p, lengthOfList - n - 1);
            if(left.next.next == null) {
                left.next = null;
                return p;
            } else {
                left.next = left.next.next;
               }
            return head;
        } else
            return null;







    }

    private ListNode moveFowardNTimes(ListNode l, int n) {
        for (int i = 0; i < n; i++) {
             if(l.next != null) {
                l = l.next;
            }
        }
        return l;
    }

    private int getLength(ListNode l) {
        ListNode p = l;
        int length = 1;
        while(p.next != null) {
            length += 1;
            p = p.next;
        }
        return length;

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);



        Solution s1 = new Solution();
        s1.removeNthFromEnd(l1, 1);
        System.out.println(s1.getLength(l1));
    }


}