
//User function Template for Java

/*Tree Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
} 
*/

class Solution
{
    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum)
    {
        // code here
        ArrayList<ArrayList<Integer>>ans = new ArrayList<>();
        helper(ans,new ArrayList<>(),sum,root);
        return ans;
    }
    
    public static void helper(ArrayList<ArrayList<Integer>>ans,ArrayList<Integer>x,int sum,Node root){
        if(root==null){
            return;
        }
        if(sum-root.data==0){
            x.add(root.data);
            ans.add(new ArrayList<>(x));
            x.remove(x.size()-1);
        }
        x.add(root.data);
        helper(ans,x,sum-root.data,root.left);
        helper(ans,x,sum-root.data,root.right);
        x.remove(x.size()-1);
    }
    
}
