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
        ListNode h1 = list1, h2 = list2, res = new ListNode(), hr = res;

        while(h1 != null || h2 != null)
        {
            if(h1 != null && h2 != null)
            {
                if(h1.val < h2.val) {
                    hr.next = h1;
                    h1 = h1.next;
                    hr = hr.next;
                } else {
                    hr.next = h2;
                    h2 = h2.next;
                    hr = hr.next;
                }
            } else if(h1 != null) {
                hr.next = h1;
                h1 = h1.next;
                hr = hr.next;   
            } else if(h2 != null) {
                hr.next = h2;
                h2 = h2.next;
                hr = hr.next;
            }
        }

        return res.next;
    }
}