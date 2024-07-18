import java.util.*;
public class Main
{
    
    public static int getMax(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            max=Math.max(arr[i],max);
        }
        return max;
    }
    
    public static void countSort(int arr[],int exp){
        int ans[]=new int[arr.length];
        int count[]=new int[10];
        for(int i=0;i<arr.length;i++){
            count[(arr[i]/exp)%10]++;
        }
        for(int i=1;i<10;i++){
            count[i]+=count[i-1];
        }
        for(int i=arr.length-1;i>=0;i--){
            ans[count[(arr[i]/exp)%10]-1]=arr[i];
            count[(arr[i]/exp)%10]--;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=ans[i];
        }
    }
    
    public static void radixsort(int arr[]){
        int m=getMax(arr);
        for(int exp=1;m/exp>0;exp*=10){
            countSort(arr,exp);
        }
    }
    
	public static void main(String[] args) {
		int arr[]={170,45,75,90,802,24,2,66};
		radixsort(arr);
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
