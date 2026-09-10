public class Position_I {
    public static int lower(int arr[],int target){
        int left=0;
        int ans=arr.length-1;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]>=target){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }return ans;
    }
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int[] arr = {1, 3, 5, 6};
        int target = 2;
        int ans=lower(arr,target);
        System.out.println("the element insert position is=>"+ans);
    }
}
