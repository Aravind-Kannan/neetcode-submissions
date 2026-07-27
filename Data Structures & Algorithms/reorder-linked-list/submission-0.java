/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head, fast = head.next;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode l1 = head, l2 = slow;

        ListNode prev = null, curr = l2;
        while(curr != null)
        {
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        l2 = prev;

        while(l1 != null && l2 != null)
        {
            ListNode tmp1 = l1.next;
            ListNode tmp2 = l2.next;

            l1.next = l2;
            l2.next = tmp1;

            l1 = tmp1;
            l2 = tmp2;
        }
    }
}
