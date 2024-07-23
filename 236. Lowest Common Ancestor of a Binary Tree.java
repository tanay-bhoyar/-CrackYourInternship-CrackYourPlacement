/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode ans=null;

    public boolean helper(TreeNode root,TreeNode p){
        if(root==null){
            return false;
        }
        if(root.val==p.val){
            return true;
        }
        return helper(root.left,p)||helper(root.right,p);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        search(root,p,q);
        if(ans==null){
            search(root,q,p);
        }
        return ans;
    }

    public boolean search(TreeNode root,TreeNode p,TreeNode q){
        if(root==null){
            return false;
        }
        if(root.val==p.val){
            if(helper(root,q)){
                ans=root;
                return false;
            }
            return true;
        }
        if(search(root.right,p,q)){
            if(helper(root.left,q)){
                ans=root;
            }
            return true;
        }
        if(search(root.left,p,q)){
            if(helper(root.right,q)){
                ans=root;
            }
            return true;
        }
        return false;
    }

}
