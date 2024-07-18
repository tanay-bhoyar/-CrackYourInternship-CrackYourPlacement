
import java.util.*;
public class Main
{
    
    public static boolean isSorted(int arr[]){
        int i=0;
        while(i<arr.length-1){
            if(arr[i]>arr[i+1]){
                return false;
            }
            i++;
        }
        return true;
    }
    
    public static void checkIfSorted(int arr[]){
        int x=-1;
        int y=-1;
        if(isSorted(arr)){
            System.out.println("YES");
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                x=i;
                break;
            }
        }
        for(int i=x;i<arr.length-1;i++){
            if(arr[i]<arr[i]+1){
                y=i+1;
            }
        }
        int arr2[]=new int[arr.length];
        for(int i=0;i<x;i++){
            arr2[i]=arr[i];
        }
        int curr=x;
        for(int i=y;i>=x;i--){
            arr2[curr]=arr[i];
            curr++;
        }
        for(int i=y+1;i<arr.length;i++){
            arr2[i]=arr[i];
        }
        if(isSorted(arr2)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    
	public static void main(String[] args) {
		int arr[]={1, 2, 5, 4, 3 };
		checkIfSorted(arr);
	}
}
