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
        HashMap<Node,Node> check = new HashMap<>();
        Node curr=head;
        while(curr!=null){
            Node temp=new Node(curr.val);
            check.put(curr,temp);
            curr=curr.next;
        }
        curr=head;
        while(curr!=null){
            Node temp=check.get(curr);
            temp.next=check.get(curr.next);
            temp.random=check.get(curr.random);
            curr=curr.next;
        }
        return check.get(head);
    }
}
