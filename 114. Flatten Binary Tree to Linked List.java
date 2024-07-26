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
    List<TreeNode> l= new ArrayList<>();
    public void flatten(TreeNode root) {
        helper(root);
        if(l.size()==0||l.size()==1){
            return;
        }
        root.left=null;
        for(int i=0;i<l.size()-1;i++){
            l.get(i).left=null;
            l.get(i).right=l.get(i+1);
        }
        return;
    }

    public void helper(TreeNode root){
        if(root==null){
            return;
        }
        l.add(root);
        helper(root.left);
        helper(root.right);
    }

}
