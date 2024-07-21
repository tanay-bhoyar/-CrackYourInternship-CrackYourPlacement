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

    public boolean isValidBST(TreeNode root) {
        helper(root);
        for(int i=0;i<check.size()-1;i++){
            if(check.get(i)>=check.get(i+1)){
                return false;
            }
        }
        System.out.println(check);
        return true;

        
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
