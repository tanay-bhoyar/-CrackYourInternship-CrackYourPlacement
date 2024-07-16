/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        if(head==null){
            return head;
        }
        HashMap<Integer,Integer> check = new HashMap<>();
        check.put(0,0);
        check.put(1,0);
        check.put(2,0);
        Node curr=head;
        while(curr!=null){
            if(curr.data==0){
                check.put(0,check.get(0)+1);
            }
            if(curr.data==1){
                check.put(1,check.get(1)+1);
            }
            if(curr.data==2){
                check.put(2,check.get(2)+1);
            }
            curr=curr.next;
        }
        Node ans=null;
        curr=ans;
        for(int i=0;i<check.get(0);i++){
            if(ans==null){
                ans=new Node(0);
                curr=ans;
            }
            curr.next=new Node(0);
            curr=curr.next;
        }
        for(int i=0;i<check.get(1);i++){
            if(ans==null){
                ans=new Node(1);
                curr=ans;
            }
            curr.next=new Node(1);
            curr=curr.next;
        }
        for(int i=0;i<check.get(2);i++){
            if(ans==null){
                ans=new Node(2);
                curr=ans;
            }
            curr.next=new Node(2);
            curr=curr.next;
        }
        return ans.next;
        // add your code here
    }
}
