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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        List<Integer> check = new ArrayList<>();
        while(head!=null){
            check.add(head.val);
            head=head.next;
        }
        Collections.sort(check);
        ListNode ans=new ListNode();
        ListNode curr=ans;
        for(int i=0;i<check.size();i++){
            curr.next=new ListNode(check.get(i));
            curr=curr.next;
        }
        return ans.next;
    }
}
