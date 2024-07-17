/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution
{
    Node compute(Node head)
    {
        if(head.next==null){
            return head;
        }
        
        Node newhead=new Node(Integer.MAX_VALUE);
        Stack<Node> st=new Stack<>();
        st.push(newhead);
        while(head!=null){
            while(st.peek().data<head.data){
                st.pop();
            }
            st.peek().next=head;
            
            st.push(head);
            head=head.next;
        }
        return newhead.next;
        // your code here
    }
}
  
