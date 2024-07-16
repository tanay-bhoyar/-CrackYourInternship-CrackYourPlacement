import java.util.*;
public class Main
{
    
    public static void permuteAllPairs(int arr1[],int arr2[],int k){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0;
        int j=arr2.length-1;
        while(j>=0){
            if(arr1[i]+arr2[j]<k){
                System.out.println("No");
                return;
            }
            i++;
            j--;
        }
        System.out.println("Yes");
    }
    
	public static void main(String[] args) {
		int a[] = {2, 1, 3};
        int b[] = { 7, 8, 9 };
        int k = 10;
        permuteAllPairs(a,b,k);
	}
}
