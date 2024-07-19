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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        Queue<ListNode> q=new LinkedList<>();
        Stack<ListNode> st= new Stack<>();
        int count=1;
        ListNode curr=head;
        while(curr!=null){
            if(count>=left && count<=right){
                st.push(curr);
            }else{
                q.offer(curr);
            }
            count++;
            curr=curr.next;
        }
        ListNode newhead=new ListNode();
        ListNode newcurr=new ListNode();
        if(left==1){
            newhead=st.pop();
            newcurr=newhead;
            while(!st.isEmpty()){
                newcurr.next=st.pop();
                newcurr=newcurr.next;
            }
            while(!q.isEmpty()){
                newcurr.next=q.peek();
                q.poll();
                newcurr=newcurr.next;
            }
        }else{
            count=2;
            newhead=q.peek();
            q.poll();
            newcurr=newhead;
            while(count<left){
                newcurr.next=q.peek();
                q.poll();
                newcurr=newcurr.next;
                count++;
            }
            while(!st.isEmpty()){
                newcurr.next=st.pop();
                newcurr=newcurr.next;
            }
            while(!q.isEmpty()){
                newcurr.next=q.peek();
                q.poll();
                newcurr=newcurr.next;
            }
        }
        newcurr.next=null;
        return newhead;
    }
}
