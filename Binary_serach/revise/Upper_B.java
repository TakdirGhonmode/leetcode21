public class Upper_B {
  public static int upper_b(int arr[],int target){
    int s=0;
    int ans=-1;
    int e=arr.length-1;
    while(s<=e){
      int mid=s+(e-s)/2;
      if(arr[mid]<=target){
        s=mid+1;
      }else{
        ans=mid;
        e=mid-1;
      }
    }
    return ans;
  }
  public static void main(String arg[]){
    int arr[]={10,20,30,40,50,50,60,70,80};
    int target=50;
    int ans=upper_b(arr,target);
    System.out.println("the ans of the upper bound is="+ans);
  }
}
