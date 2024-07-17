class Tree
{
    
    static List<Float> check = new ArrayList<>();
    
    public static float findMedian(Node root)
    {
        check.clear();
        helper(root);
        if(check.size()%2==1){
            return (check.get(check.size()/2));
        }else{
            float a=check.get(check.size()/2);
            float b= check.get((check.size()/2)-1);
            return (a+b)/2;
        }
        // code here.
    }
    
    public static void helper(Node root){
        if(root==null){
            return;
        }
        helper(root.left);
        check.add((float)root.data);
        helper(root.right);
    }
    
}
