//User function Template for Java

/* 
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution{
    Node divide(int N, Node head){
        // code here
        if(head==null){
            return head;
        }
        Queue<Node> odd=new LinkedList<>();
        Queue<Node> even=new LinkedList<>();
        Node curr=head;
        while(curr!=null){
            if(curr.data%2==0){
                even.add(curr);
            }else{
                odd.add(curr);
            }
            curr=curr.next;
        }
        Node ans=null;
        Node newcurr=null;
        if(!even.isEmpty()){
            ans=even.peek();
            even.poll();
            newcurr=ans;
            while(!even.isEmpty()){
                newcurr.next=even.peek();
                even.poll();
                newcurr=newcurr.next;
            }while(!odd.isEmpty()){
                newcurr.next=odd.peek();
                odd.poll();
                newcurr=newcurr.next;
            }
        }else{
            ans=odd.peek();
            odd.poll();
            newcurr=ans;
            while(!odd.isEmpty()){
                newcurr.next=odd.peek();
                odd.poll();
                newcurr=newcurr.next;
            }
        }
        newcurr.next=null;
        return ans;
    }
}
