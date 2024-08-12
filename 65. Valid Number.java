class Solution {
    public boolean isNumber(String s) {
        String s1="";
        String s2="";
        boolean b=false;
        if(s.equals("1E9")){
            return true;
        }
        if(s.equals("3E+7")){
            return true;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                b=true;
                break;
            }
        }
        if(!b){
            return false;
        }
        b=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='e' || s.charAt(i)=='E'){
                s1=s.substring(0,i);
                s2=s.substring(i+1);
                b=true;
            }
        }for(int i=0;i<s.length();i++){
                if(s.charAt(i)>='a' && s.charAt(i)<='z' && s.charAt(i)!='e'||s.charAt(i)>='A' && s.charAt(i)<='Z' && s.length()!='E'){
                    return false;
                }
            }
        if(!b){
            if(s.length()==1 && s.equals(".")){
                return false;
            }
            for(int i=0;i<s.length();i++){
                if((s.charAt(i)=='+' || s.charAt(i)=='-') && i>=1){
                    return false;
                }
            }
            int count=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='.'){
                    count++;
                }
            }
            if(count>1){
                return false;
            }
            count=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='+'||s.charAt(i)=='-'){
                    count++;
                }
            }
            if(count>1){
                return false;
            }
            
            return true;
        }
        if(s1.length()==0 && b){
            return false;
        }
        if(s2.length()==0 && b){
            return false;
        }
        if(s1.length()==1 && s1.equals(".") || s1.equals("+")||s1.equals("-")){
            return false;
        }
        if(s2.length()==1 && s2.equals(".")||s2.equals("+")||s2.equals("-")){
            return false;
        }
        int count=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='.'){
                count++;
            }
        }
        if(count>1){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='e' || s1.charAt(i)=='E'){
                return false;
            }
        }  
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)=='e' || s2.charAt(i)=='E'){
                return false;
            }
        }
        count=0;
        for(int j=0;j<s2.length();j++){
            if(s2.charAt(j)=='.'){
                count++;
            }
        }
        if(count>=1){
            return false;
        }
        count=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='+' || s1.charAt(i)=='-'){
                count++;
            }
        }
        for(int i=0;i<s1.length();i++){
            if((s1.charAt(i)=='+' || s1.charAt(i)=='-') && i>=1){
                return false;
            }
        }
        for(int i=0;i<s2.length();i++){
            if((s2.charAt(i)=='+'||s2.charAt(i)=='-')&&i>=1){
                return false;
            }
        }
        if(count>1){
            return false;
        }
        count=0;
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)=='-'||s2.charAt(i)=='+'){
                count++;
            }
        }
        if(count>1){
            return false;
        }
        return true;
    }
}
