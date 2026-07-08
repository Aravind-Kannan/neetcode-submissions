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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(), p1 = list1, p2 = list2;
        ListNode start = result;

        while(p1 != null && p2 != null)
        {
            if(p1.val < p2.val)
            {
                result.next = new ListNode(p1.val);
                p1 = p1.next;
            } else {
                result.next = new ListNode(p2.val);
                p2 = p2.next;
            }
            result = result.next;
        }

        while(p1 != null) {
            result.next = new ListNode(p1.val);
            p1 = p1.next;
            result = result.next;
        }

        while(p2 != null) {
            result.next = new ListNode(p2.val);
            p2 = p2.next;
            result = result.next;
        }

        return start.next;
    }    
}