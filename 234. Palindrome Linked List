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

    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return true;
        }
        ListNode curr=head;
        int n=0;
        while(curr!=null){
            n++;
            curr=curr.next;
        }
        if(n%2==1){
            n=(n+1)/2;
        }else{
            n=n/2;
        }
        curr=head;
        for(int i=0;i<n;i++){
            curr=curr.next;
        }
        ListNode newhead=curr;
        newhead=reverse(newhead);
        while(newhead!=null){
            if(head.val!=newhead.val){
                return false;
            }
            head=head.next;
            newhead=newhead.next;
        }        
       return true;
    }
}
