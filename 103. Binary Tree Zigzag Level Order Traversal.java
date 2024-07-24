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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        boolean b= false;
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> x = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(!b){
                    x.add(curr.val);
                }else{
                    x.add(0,curr.val);
                }
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
            b=!b;
            ans.add(x);
        }
        return ans;
    }
}
