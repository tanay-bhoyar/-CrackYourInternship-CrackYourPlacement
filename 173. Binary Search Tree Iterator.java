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
class BSTIterator {
    List<Integer> check = new ArrayList<>();
    int i=0;
    public BSTIterator(TreeNode root) {
        helper(root);
    }

    public void helper(TreeNode root){
        if(root==null){
            return;
        }
        helper(root.left);
        check.add(root.val);
        helper(root.right);
    }

    
    public int next() {
        return check.get(i++);
    }
    
    public boolean hasNext() {
        if(i==check.size()){
            return false;
        }else{
            return true;
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
