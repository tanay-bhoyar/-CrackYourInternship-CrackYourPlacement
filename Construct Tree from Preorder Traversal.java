
/*class Node{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/
class Solution{
    Node constructTree(int n, int pre[], char preLN[]){
	    // code here
	    if(n==0){
	        return null;
	    }
	    Stack<Node> st= new Stack<>();
	    Node root=null;
	    root=new Node(pre[0]);
	    st.push(root);
	    for(int i=1;i<pre.length;i++){
	        Node curr=st.peek();
	        st.pop();
	        Node newnode=new Node(pre[i]);
	        if(curr.left==null){
	            curr.left=newnode;
	        }else if(curr.right==null){
	            curr.right=newnode;
	        }
	        if(curr.left==null || curr.right==null){
	            st.push(curr);
	        }
	        if(preLN[i]=='N'){
	            st.push(newnode);
	        }
	    }
	    return root;
    }
} 
