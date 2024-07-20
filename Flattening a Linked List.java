/*Node class  used in the program
class Node
{
    int data;
    Node next;
    Node bottom;

    Node(int d)
    {
        data = d;
        next = null;
        bottom = null;
    }
}
*/
/*  Function which returns the  root of
    the flattened linked list. */
class GfG {
    Node flatten(Node root) {
        // Your code here\
        if(root==null){
            return null;
        }
        List<Integer> check = new ArrayList<>();
        Node curr=root;
        while(curr!=null){
            if(curr.bottom!=null){
                Node save= curr.next;
                curr.next=curr.bottom;
                curr.bottom=null;
                Node x=curr.next;
                while(x.next!=null){
                    x=x.next;
                }
                x.next=save;
            }
            curr=curr.next;
        }
        curr=root;
        while(curr!=null){
            check.add(curr.data);
            curr=curr.next;
        }
        Collections.sort(check);
        root=new Node(check.get(0));
        curr=root;
        for(int i=1;i<check.size();i++){
            curr.bottom=new Node(check.get(i));
            curr=curr.bottom;
        }
        return root;
    }
}
