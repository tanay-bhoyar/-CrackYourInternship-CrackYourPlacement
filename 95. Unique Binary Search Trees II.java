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
    List<TreeNode> ans = new ArrayList<>();
    List<TreeNode> ans2 = new ArrayList<>();
    public void helper(List<List<Integer>> check,List<Integer> x,int nums[]){
        if(x.size()==nums.length){
            check.add(new ArrayList<>(x));
        }
        for(int i=0;i<nums.length;i++){
            if(x.contains(nums[i])){
                continue;
            }
            x.add(nums[i]);
            helper(check,x,nums);
            x.remove(x.size()-1);
        }
    }

    public TreeNode createTree(TreeNode root,int val){
        if(root==null){
            root=new TreeNode(val);
            return root;
        }
        if(root.val>val){
            root.left=createTree(root.left,val);
        }else{
            root.right=createTree(root.right,val);
        }
        return root;
    }

    public boolean treeEqual(TreeNode n1,TreeNode n2){
        if(n1==null&&n2==null){
            return true;
        }if(n1==null||n2==null){
            return false;
        }
        return treeEqual(n1.left,n2.left) && treeEqual(n1.right,n2.right) && n1.val==n2.val;
    }

    public List<TreeNode> generateTrees(int n) {
        List<List<Integer>> check = new ArrayList<>();
        List<Integer> x=new ArrayList<>();
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=i+1;
        }
        helper(check,x,nums);
        for(int i=0;i<check.size();i++){
            TreeNode curr=new TreeNode();
            for(int j=0;j<check.get(i).size();j++){
                createTree(curr,check.get(i).get(j));
            }
            ans2.add(curr.right);
            boolean b=false;
            for(int j=0;j<ans.size();j++){
                if(curr.right.val==ans.get(j).val && treeEqual(curr.right,ans.get(j))){
                    b=true;
                }
            }
            if(!b){
                ans.add(curr.right);
            }
        }
        return ans;
    }
}
