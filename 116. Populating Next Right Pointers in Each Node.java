/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null){
            return null;
        }
        Queue<Node>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Node>l=new ArrayList<>();
            for(int i=0;i<size;i++){
                Node curr=q.poll();
                
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
                l.add(curr);
            }
            for(int i=0;i<l.size();i++){
                if(i==l.size()-1){
                    l.get(i).next=null;
                    continue;
                }else{
                    l.get(i).next=l.get(i+1);
                }
            }
        }
        return root;
    }
}
