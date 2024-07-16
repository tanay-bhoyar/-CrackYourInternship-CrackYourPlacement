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
    int count=0;
    public int maxDepth(TreeNode root) {
        return helper(root);
    }

    public int helper(TreeNode root){
        if(root==null){
            return 0;
        }
        int x=(Math.max(helper(root.left),helper(root.right)))+1;
        return x;
    }
}
