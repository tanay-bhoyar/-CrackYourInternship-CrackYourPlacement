
/*
class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

static class Solution {
    // Function that constructs BST from its preorder traversal.
    Node root=new Node(0);
    public Node Bst(int pre[], int size) {
        // code here
        
        for(int i=0;i<pre.length;i++){
            helper(root,pre[i]);
        }
        return root.right;
    }
    
    public Node helper(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(val>root.data){
            root.right=helper(root.right,val);
        }else{
            root.left=helper(root.left,val);
        }
        return root;
    }

    
}
