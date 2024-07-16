class Solution
{
    int count=0;
    //Function to count number of nodes in BST that lie in the given range.
    int getCount(Node root,int l, int h)
    {
        helper(root,l,h);
        return count;
        //Your code here
    }
    
    
    public void helper(Node root,int l,int h){
        if(root==null){
            return;
        }
        if(root.data>=l && root.data<=h){
            count++;
        }
        helper(root.left,l,h);
        helper(root.right,l,h);
    }
}
