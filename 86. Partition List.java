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
    public ListNode partition(ListNode head, int x) {
        if(head==null){
            return head;
        }
        Queue<ListNode> less=new LinkedList<>();
        Queue<ListNode> more = new LinkedList<>();
        ListNode curr=head;
        while(curr!=null){
            if(curr.val<x){
                less.add(curr);
            }else{
                more.add(curr);
            }
            curr=curr.next;
        }
        System.out.println(less+" "+more);
        ListNode ans = new ListNode();
        ListNode newcurr=ans;
        if(!less.isEmpty()){
            ans=less.peek();
            less.poll();
            newcurr=ans;
            while(!less.isEmpty()){
                newcurr.next=less.peek();
                less.poll();
                newcurr=newcurr.next;
            }
            while(!more.isEmpty()){
                newcurr.next=more.peek();
                more.poll();
                newcurr=newcurr.next;
            }
        }else{
            ans=more.peek();
            more.poll();
            newcurr=ans;
            while(!more.isEmpty()){
                newcurr.next=more.peek();
                more.poll();
                newcurr=newcurr.next;
            }
        }
        newcurr.next=null;
        return ans;
    }
}
