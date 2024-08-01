class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        HashMap<String,Map<String,Double>>graph=new HashMap<>();
        for(int i=0;i<equations.size();i++){
            List<String>equation= equations.get(i);
            String a=equation.get(0);
            String b=equation.get(1);
            graph.putIfAbsent(a,new HashMap<>());
            graph.putIfAbsent(b,new HashMap<>());
            graph.get(a).put(b,values[i]);
            graph.get(b).put(a,1/values[i]);
        }
        double ans[]=new double[queries.size()];
        for(int i=0;i<queries.size();i++){
            List<String>query=queries.get(i);
            String src=query.get(0);
            String des=query.get(1);
            Set<String>visited=new HashSet<>();
            ans[i]=helper(graph,src,des,visited);
        }
        return ans;
    }

    public double helper(HashMap<String,Map<String,Double>>graph,String src,String des,Set<String> visited){
        if(!graph.containsKey(src) || !graph.containsKey(des)){
            return -1.0;
        }
        if(src.equals(des)){
            return 1.0;
        }
        visited.add(src);
        Map<String,Double>check = graph.get(src);
        for(Map.Entry<String,Double>i:check.entrySet()){
            String nextNode=i.getKey();
            if(visited.contains(nextNode)){
                continue;
            }
            double result=helper(graph,nextNode,des,visited);
            if(result!=-1.0){
                return result*i.getValue();
            }
        }
        return -1.0;
    }

}
