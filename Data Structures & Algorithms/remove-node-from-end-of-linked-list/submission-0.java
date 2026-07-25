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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;

        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode handle = temp;
        while(handle != null)
        {
            handle = handle.next;
            size++;
        }

        int cur = 0;
        handle = temp;
        while(handle != null)
        {
            if(size - n - 1 == cur)
            {
                handle.next = handle.next.next;
                break;
            }
            cur++;
            handle = handle.next;
        }

        return temp.next;
    }
}
