public class Main
{
    
    public static void search(String str,String pat,int q){
        int p=0;
        int t=0;
        int h=1;
        int j;
        for(int i=0;i<pat.length()-1;i++){
            h=(h*256)%q;
            
        }
        for(int i=0;i<pat.length();i++){
            p=(256*p+pat.charAt(i))%q;
            t=(256*t+str.charAt(i))%q;
        }
        for(int i=0;i<=str.length()-pat.length();i++){
            if(p==t){
                for(j=0;j<pat.length();j++){
                    if(str.charAt(i+j)!=pat.charAt(j)){
                        break;
                    }
                }
                if(j==pat.length()){
                    System.out.println(i);
                }
            }
            if(i<str.length()-pat.length()){
                t=(256*(t-str.charAt(i)*h)+str.charAt(i+pat.length()))%q;
                if(t<0){
                    t=t+q;
                }
            }
        }
    }
    
	public static void main(String[] args) {
		String txt = "GEEKS FOR GEEKS";
        String pat = "GEEK";
        int q=101;
        search(txt,pat,q);
	}
}
