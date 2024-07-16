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
    public boolean isBalanced(TreeNode root) {
        return helper(root);
    }

    public boolean helper(TreeNode root){
        if(root==null){
            return true;
        }
        if(Math.abs(findHeight(root.left)-findHeight(root.right))>1){
            return false;
        }
        return helper(root.left) && helper(root.right);
    }

    public int findHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        int x=Math.max(findHeight(root.right),findHeight(root.left))+1;
        return x;
    }

}
