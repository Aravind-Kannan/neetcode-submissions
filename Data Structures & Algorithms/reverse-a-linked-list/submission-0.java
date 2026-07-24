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
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;

        List<ListNode> arr = new ArrayList<ListNode>();
        ListNode handle = head;
        while(handle != null)
        {
            arr.add(handle);
            handle = handle.next;
        }

        ListNode result = new ListNode(-1);
        handle = result;
        for(int i = arr.size() - 1; i >= 0; i--)
        {
            handle.next = arr.get(i);
            handle = handle.next;
        }

        handle.next = null;

        return result.next;
    }
}
