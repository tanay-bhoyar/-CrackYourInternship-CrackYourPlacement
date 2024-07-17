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

    List<Integer> check = new ArrayList<>();

    public int getMinimumDifference(TreeNode root) {
        helper(root);
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<check.size()-1;i++){
            ans=Math.min(ans,Math.abs(check.get(i)-check.get(i+1)));
        }
        return ans;
    }

    public void helper(TreeNode root){
        if(root==null){
            return;
        }
        helper(root.left);
        check.add(root.val);
        helper(root.right);
    }
}
