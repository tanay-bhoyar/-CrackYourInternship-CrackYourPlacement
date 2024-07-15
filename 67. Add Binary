class Solution {
    public String addBinary(String a, String b) {
        int alen=a.length();
        int blen=b.length();
        if(alen>blen){
            for(int i=0;i<alen-blen;i++){
                b='0'+b;
            }
        }
        if(alen<blen){
            for(int i=0;i<blen-alen;i++){
                a='0'+a;
            }
        }
        int i=a.length()-1;
        int carry=0;
        String ans="";
        while(i>=0){
            if(a.charAt(i)=='1' && b.charAt(i)=='1' && carry==1){
                ans='1'+ans;
            }else if(a.charAt(i)=='1' && b.charAt(i)=='1' && carry==0){
                ans='0'+ans;
                carry=1;
            }else if(a.charAt(i)=='1' && b.charAt(i)=='0' && carry==1){
                ans='0'+ans;
                carry=1;
            }else if(a.charAt(i)=='1' && b.charAt(i)=='0' && carry==0){
                ans='1'+ans;
                carry=0;
            }else if(a.charAt(i)=='0' && b.charAt(i)=='1' && carry==1){
                ans='0'+ans;
                carry=1;
            }else if(a.charAt(i)=='0' && b.charAt(i)=='1' && carry==0){
                ans='1'+ans;
                carry=0;
            }else if(a.charAt(i)=='0' && b.charAt(i)=='0' && carry==1){
                ans='1'+ans;
                carry=0;
            }else if(a.charAt(i)=='0' && b.charAt(i)=='0' && carry==0){
                ans='0'+ans;
                carry=0;
            }
            i--;
        }
        if(carry==1){
            ans='1'+ans;
        }
        return ans;
    }
}
