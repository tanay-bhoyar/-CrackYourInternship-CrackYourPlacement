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
    int ans=0;
    public int sumOfLeftLeaves(TreeNode root) {
        
        helper(root);
        return ans;
    }

    public void helper(TreeNode root){
        if(root==null){
            return;
        }
        if(root.left!=null && root.left.left==null && root.left.right==null){
            ans+=root.left.val;
        }
        System.out.println(root.val);
        helper(root.right);
        helper(root.left);
        
    }

}
