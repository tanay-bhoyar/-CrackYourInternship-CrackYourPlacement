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
    public ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer,Integer> check = new HashMap<>();
        ListNode curr=head;
        while(curr!=null){
            if(check.containsKey(curr.val)){
                check.put(curr.val,check.get(curr.val)+1);
            }else{
                check.put(curr.val,1);
            }
            curr=curr.next;
        }
        ListNode newhead=new ListNode();
        ListNode curr2=newhead;
        curr=head;
        while(curr!=null){
            if(check.get(curr.val)==1){
                curr2.next=new ListNode(curr.val);
                curr2=curr2.next;
            }
            curr=curr.next;
        }
        return newhead.next;
    }
}
