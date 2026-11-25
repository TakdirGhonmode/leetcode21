public class Floor{
  public static int floor(int arr[],int target){
    int low=0;
    int high=arr.length-1;
    int ans=-1;
    int mid=0;
    while(low<=high){
      mid=low+(high-low)/2;
      if(arr[mid]<target){
        ans=arr[mid];
        low=mid+1;
      }else{
       high=mid-1;
      }
    }
    return ans;
  }
  public static void main(String arg[]){
    int arr[]={10,20,30,40,50,60};
    int target=30;
    int ans=floor(arr,target);
    System.out.println("the ans is =>"+ans);
  }
  
}
