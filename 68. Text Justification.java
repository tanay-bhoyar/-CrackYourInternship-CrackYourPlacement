class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String>ans = new ArrayList<>();
        List<List<String>> check =new ArrayList<>();
        int i=0;
        int j=0;
        while(i<words.length){
            List<String>x=new ArrayList<>();
            int currlen=0;
            int space=0;
            while(i<words.length && currlen+words[i].length()+space<=maxWidth){
                x.add(words[i]);
                space++;
                currlen+=words[i].length();
                x.add(words[i]);   
                i++;
                
            }
            check.add(x);
            j=i+1;
        }
        for(int x=0;x<check.size();x++){
            int y=0;
            while(y<check.get(x).size()){
                check.get(x).remove(y);
                y++;
            }
        }
        for(int x=0;x<check.size();x++){
            int sum=0;
            for(int y=0;y<check.get(x).size();y++){
                sum+=check.get(x).get(y).length();
            }
            if(check.get(x).size()==1){
                String curr=check.get(x).get(0);
                for(int k=0;k<maxWidth-check.get(x).get(0).length();k++){
                    curr+=" ";
                }
                ans.add(curr);
                continue;
            }
            int space=(maxWidth-sum)/(check.get(x).size()-1);
            int extra=(maxWidth-sum)%(check.get(x).size()-1);
            String curr="";
            if(x==check.size()-1){
                for(int y=0;y<check.get(x).size();y++){
                    if(y==check.get(x).size()-1){
                        curr+=check.get(x).get(y);
                        continue;
                    }
                    curr+=check.get(x).get(y)+" ";
                }
                while(curr.length()<maxWidth){
                    curr+=" ";
                }
                ans.add(curr);
                break;
            }
            for(int y=0;y<check.get(x).size();y++){
                curr+=check.get(x).get(y);
                for(int k=0;k<space && y!=check.get(x).size()-1;k++){
                    curr+=" ";
                    if(extra>0){
                        curr+=" ";
                        extra--;
                    }
                }
            }
            ans.add(curr);
        }
        System.out.println(check);
        return ans;
    }
}
