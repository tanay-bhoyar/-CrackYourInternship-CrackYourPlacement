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

    List<String> ans = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        helper(root,"");
        return ans;
    }

    public void helper(TreeNode root,String str){
        if(root==null){
            return;
        }
        
        str=str+"->"+Integer.toString(root.val);
        if(root.left==null && root.right==null){
            ans.add(str.substring(2));
            return;
        }
        helper(root.left,str);
        helper(root.right,str);
    }

}
