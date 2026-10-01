/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node preserveHead = head;
        Node handle = head;

        Map<Node, Node> map = new HashMap<>();

        while(handle != null)
        {
            map.put(handle, new Node(handle.val));
            handle = handle.next;
        }

        handle = preserveHead;

        while(handle != null)
        {
            Node cur = map.get(handle);
            cur.next = map.get(handle.next);
            cur.random = map.get(handle.random);
            
            handle = handle.next;
        }

        return map.get(preserveHead);
    }
}
