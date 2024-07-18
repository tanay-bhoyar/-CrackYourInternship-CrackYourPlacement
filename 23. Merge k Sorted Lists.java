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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        if(lists.length==1){
            return lists[0];
        }
        ListNode head=null;
        for(int i=0;i<lists.length;i++){
            head=merge(head,lists[i]);
        }
        return head;
    }

    public ListNode merge(ListNode n1,ListNode n2){
        ListNode head=null;
        ListNode curr1=n1;
        ListNode curr2=n2;
        if(n1==null){
            return n2;
        }
        if(n2==null){
            return n1;
        }
        if(curr1.val>curr2.val){
            head=curr2;
            curr2=curr2.next;
        }else{
            head=curr1;
            curr1=curr1.next;
        }
        ListNode curr=head;
        while(curr1!=null && curr2!=null){
            if(curr1.val>curr2.val){
                curr.next=curr2;
                curr2=curr2.next;
                curr=curr.next;
            }else{
                curr.next=curr1;
                curr1=curr1.next;
                curr=curr.next;
            }
        }
        if(curr1!=null){
            while(curr1!=null){
                curr.next=curr1;
                curr1=curr1.next;
                curr=curr.next;
            }
        }
        if(curr2!=null){
            while(curr2!=null){
                curr.next=curr2;
                curr2=curr2.next;
                curr=curr.next;
            }
        }
        return head;
    }

}
