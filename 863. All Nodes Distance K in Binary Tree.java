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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,TreeNode> map=new HashMap<>();
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null){
                    map.put(curr.left.val,curr);
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    map.put(curr.right.val,curr);
                    q.offer(curr.right);
                }
            }
        }
        Set<TreeNode> check = new HashSet<>();
        q.offer(target);
        while(!q.isEmpty() && k>0){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                check.add(curr);
                if(curr.left!=null && !check.contains(curr.left)){
                    q.offer(curr.left);
                }
                if(curr.right!=null && !check.contains(curr.right)){
                    q.offer(curr.right);
                }
                if(map.containsKey(curr.val) && !check.contains(map.get(curr.val))){
                    q.offer(map.get(curr.val));
                }
            }
            k--;
        }
        while(!q.isEmpty()){
            ans.add(q.poll().val);
        }
        return ans;
    }
}
