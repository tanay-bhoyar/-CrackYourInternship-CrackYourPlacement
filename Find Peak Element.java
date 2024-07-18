public class Main
{
    
    public static void findPeak(int arr[]){
        int ans=0;
        if(arr.length%2==1){
            ans=arr[arr.length/2];
        }else{
            ans=(arr[arr.length/2]+arr[(arr.length/2)-1])/2;
        }
        int fin=0;
        for(int i=0;i<arr.length;i++){
            fin+=(Math.abs(ans-arr[i]));
        }
        System.out.println(fin);
    }
    
	public static void main(String[] args) {
		int arr[]={4, 6};
		findPeak(arr);
	}
}
