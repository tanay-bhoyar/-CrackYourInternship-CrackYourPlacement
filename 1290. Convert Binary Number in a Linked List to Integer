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

    public ListNode rev(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public int getDecimalValue(ListNode head) {
        ListNode newhead=rev(head);
        int ans=0;
        int curr=1;
        while(newhead!=null){
            if(newhead.val==1){
                ans=ans+curr;
            }
            newhead=newhead.next;
            curr=curr*2;
        }
        return ans;
    }
}
