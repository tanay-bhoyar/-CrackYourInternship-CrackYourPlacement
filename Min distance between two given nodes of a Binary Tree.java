// FUNCTION CODE
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

/* Should return minimum distance between a and b
   in a tree with given root*/
class GfG {
    int findDist(Node root, int a, int b) {
        // Your code here
        HashMap<Integer,Node>hm=new HashMap<>();
        Node useful=null;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Node curr=q.poll();
                if(curr.left!=null){
                    hm.put(curr.left.data,curr);
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    hm.put(curr.right.data,curr);
                    q.offer(curr.right);
                }
                if(curr.data==a){
                    useful=curr;
                }
            }
        }
        int count=0;
        Set<Node>s=new HashSet<>();
        q.offer(useful);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Node curr=q.poll();
                if(curr.data==b){
                    return count;
                }
                s.add(curr);
                if(curr.left!=null && !s.contains(curr.left)){
                    q.offer(curr.left);
                }
                if(curr.right!=null && !s.contains(curr.right)){
                    q.offer(curr.right);
                }
                if(hm.containsKey(curr.data) && !s.contains(hm.get(curr.data))){
                    q.offer(hm.get(curr.data));
                }
            }
            count++;
        }
        
        return 0;
    }
}
