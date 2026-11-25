public class Find_First_greatest {
  public static int findFirstGreater(int arr[],int target){
    int low=0;
    int high=arr.length-1;
    int ans=-1;
    int mid=0;
    while(low<=high){
      mid=low+(high-low)/2;
      if(target<arr[mid]){
        ans=arr[mid];
        high=mid-1;
      }else{
        low=mid+1;
      }
    }
    return ans;
  }
  public static void main(String arg[]){
    int arr[]={2,4,6,8,10};
    int target=8;
    int ans=findFirstGreater(arr,target);
    System.out.println("the ans we got the First largest Element is =>"+ans);
  }
}
