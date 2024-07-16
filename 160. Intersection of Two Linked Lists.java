/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> check1=new HashSet<>();
        ListNode curr=headA;
        while(curr!=null){
            check1.add(curr);
            curr=curr.next;
        }
        Set<ListNode> check2= new HashSet<>();
        curr=headB;
        while(curr!=null){
            if(check1.contains(curr)){
                check2.add(curr);
            }
            
            curr=curr.next;
        }
        curr=headA;
        while(curr!=null){
            if(check2.contains(curr)){
                return curr;
            }
            curr=curr.next;
        }
        return null;
    }
}
