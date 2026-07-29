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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1 = l1, h2 = l2, result = new ListNode(), handle = result;
        int carry = 0;
        while(h1 != null && h2 != null)
        {
            int digitSum = h1.val + h2.val + carry;
            if(digitSum >= 10) {
                carry = digitSum / 10;
            } else {
                carry = 0;
            }
            result.next = new ListNode(digitSum % 10);
            result = result.next;

            h1 = h1.next;
            h2 = h2.next;
        }

        while(h1 != null)
        {
            int digitSum = h1.val + carry;
            if(digitSum >= 10) {
                carry = digitSum / 10;
            } else {
                carry = 0;
            }
            result.next = new ListNode(digitSum % 10);
            result = result.next;

            h1 = h1.next;
        }

        while(h2 != null)
        {
            int digitSum = h2.val + carry;
            if(digitSum >= 10) {
                carry = digitSum / 10;
            } else {
                carry = 0;
            }
            result.next = new ListNode(digitSum % 10);
            result = result.next;

            h2 = h2.next;
        }

        if(carry > 0)
        {
            result.next = new ListNode(carry);
            result = result.next;
        }

        return handle.next;
    }
}
