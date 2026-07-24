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
        Node handle = head;
        Node newHead = new Node(-1);
        Node newHandle = newHead;
        Map<Node, Node> map = new HashMap<>();

        while(handle != null)
        {
            Node newNode = new Node(handle.val);
            newHandle.next = newNode;
            map.put(handle, newNode);
            newHandle = newHandle.next;
            handle = handle.next;
        }

        handle = head;
        newHandle = newHead.next;

        while(handle != null)
        {
            newHandle.random = map.get(handle.random);
            newHandle = newHandle.next;
            handle = handle.next;
        }

        return newHead.next;
    }
}
