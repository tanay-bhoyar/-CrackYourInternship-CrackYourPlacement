/* Following is the Linked list node structure */

/*class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    void reorderlist(Node head) {
        // Your code here
        int i=1;
        Queue<Node> q=new LinkedList<>();
        Stack<Node> st = new Stack<>();
        Node curr=head;
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
