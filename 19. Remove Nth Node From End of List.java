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
        ListNode curr=head;
        int size=0;
        while(curr!=null){
            curr=curr.next;
            size++;
        }
        if(size==n){
            return head.next;
        }
        int c=size-n;
        curr=head;
        while(c>1){
            curr=curr.next;
            c--;
        }
        if(curr.next==null){
            return null;
        }
        curr.next=curr.next.next;
        System.out.println(curr.val);
        return head;
    }
}
