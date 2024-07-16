import java.util.*;
public class Main
{
    
    public static void printDuplicates(String str){
        HashMap<Character,Integer> check= new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                continue;
            }
            if(check.containsKey(str.charAt(i))){
                check.put(str.charAt(i),check.get(str.charAt(i))+1);
            }else{
                check.put(str.charAt(i),1);
            }
        }
        for(Map.Entry<Character,Integer> i:check.entrySet()){
            if(i.getValue()>1){
                System.out.println(i.getKey()+" count:"+i.getValue());
            }
        }
    }
    
	public static void main(String[] args) {
		String str="test string";
		printDuplicates(str);
	}
}
