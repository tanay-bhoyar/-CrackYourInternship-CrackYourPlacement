
/*class Node {
        int data;
        Node left, right;
 
        Node(int item) {
            data = item;
            left = right = null;
        }
    }*/

//Function should return true if a deadEnd is found in the bst otherwise return false.
class Solution
{
    public static boolean isDeadEnd(Node root)
    {
        //Add your code here.
        if(root==null){
            return false;
        }
        return helper(root,0,Integer.MAX_VALUE);
    }
    
    public static boolean helper(Node root,int min,int max){
        if(root==null){
            return false;
        }
        if(root.data-min==1 && max-root.data==1){
            return true;
        }
        if(helper(root.left,min,root.data)  || helper(root.right,root.data,max)){
            return true;
        }
        return false;
    }
    
}
