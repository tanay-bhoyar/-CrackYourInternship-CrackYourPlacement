/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return helper(root1,root2);
    }

    public TreeNode helper(TreeNode n1,TreeNode n2){
        if(n1==null && n2==null){
            return null;
        }if(n1==null){
            return n2;
        }if(n2==null){
            return n1;
        }
        TreeNode curr=new TreeNode(n1.val+n2.val);
        curr.left=helper(n1.left,n2.left);
        curr.right=helper(n1.right,n2.right);
        return curr;
    }

}
