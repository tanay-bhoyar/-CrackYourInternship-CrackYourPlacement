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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1=reverse(l1);
        l2=reverse(l2);
        ListNode ans=new ListNode();
        ListNode curr=ans;
        int rem=0;
        while(l1!=null && l2!=null){
            int sum=l1.val+l2.val+rem;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            l1=l1.next;
            l2=l2.next;
            rem=sum/10;
        }
        if(l1!=null){
            while(l1!=null){
                int sum=l1.val+rem;
                curr.next=new ListNode(sum%10);
                curr=curr.next;
                l1=l1.next;
                rem=sum/10;
            }
        }
        if(l2!=null){
            while(l2!=null){
                int sum=l2.val+rem;
                curr.next=new ListNode(sum%10);
                curr=curr.next;
                l2=l2.next;
                rem=sum/10;
            }
        }
        if(rem!=0){
            curr.next=new ListNode(rem);
        }
        ans=ans.next;
        ans=reverse(ans);
        return ans;
    }
}
