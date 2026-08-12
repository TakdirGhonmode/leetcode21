public class Painters{
  public static boolean isValid(int arr[],int k,int mid){
    int painterCount=1;
    int paintersLength=0;
    for(int i=0;i<arr.length;i++){
        if(paintersLength+arr[i]<=mid){
          paintersLength+=arr[i];
        }else{
          painterCount++;
        paintersLength=0;
        if(painterCount>k || arr[i]>mid){
          return false;
        }else{
          paintersLength+=arr[i];
        }
        }
    }
    return true;
  }
  public static int painters(int arr[],int k){
    if(arr.length<k){
      return -1;
    }
    int s=1;
    int sum=0;
    int ans=-1;
    for(int i=0;i<arr.length;i++){
      sum+=arr[i];
    }
    int e=sum;
    int mid=0;
    while(e<=s){
      mid=s+(e-s)/2;
      if(isValid(arr,k,mid)){
        ans=mid;
        e=mid-1;
      }else{
        s=mid+1;
      }
    }
    return ans;
  }
  public static void main(String arg[]){
    int arr[]={5,10,30,20,15};
    int k=3;
    int as=painters(arr,k);
    System.out.print("the ans is=>"+as);
  }
}
