import java.util.*;
public class Main
{
    
    public static void findCeiling(int nums[],int x){
        if(x>nums[nums.length-1]){
            System.out.println("floor = "+nums[nums.length-1]+",ceiling dosen't exist");
        }
        if(x<nums[0]){
            System.out.println("floor dosen't exist, Ceiling = "+nums[0]);
        }
        for(int i=0;i<nums.length-1;i++){
            if(x>=nums[i] && x<=nums[i+1]){
                System.out.println("Floor = "+nums[i]+", Ceiling = "+nums[i+1]);
                return;
            }
        }
    }
    
	public static void main(String[] args) {
		int a[] ={1, 2, 8, 10, 10, 12, 19};
		findCeiling(a,20);
	}
}
