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
    public void reorderList(ListNode head) {
        int i=1;
        Queue<ListNode> q=new LinkedList<>();
        Stack<ListNode> st = new Stack<>();
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            i++;
        }
        if(i%2==1){
            i=(i+1)/2;
        }else{
            i=(i/2)+1;
        }
        curr=head;
        while(i!=1){
            q.add(curr);
            curr=curr.next;
            i--;
        }
        while(curr!=null){
            st.push(curr);
            curr=curr.next;
        }
        curr=head;
        q.poll();
        while(!q.isEmpty()){
            if(!st.isEmpty()){
                curr.next=st.pop();
            }
            
            curr=curr.next;
            curr.next=q.peek();
            q.poll();
            curr=curr.next;
        }
        if(!st.isEmpty()){
            curr.next=st.pop();
            curr=curr.next;
        }
        curr.next=null;
    }
}
