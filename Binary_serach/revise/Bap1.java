public class Bap1 {
  public static boolean isValid(int arr[],int k,int mid){
    int studentCount=1;
    int pages=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]+pages<=mid){
        pages+=arr[i];
      }else{
        studentCount++;
        if(studentCount>k || arr[i]>mid){
             return false;
        }else{
          pages=0;
          pages+=arr[i];
        }
      }
    }
    return true;
  }
  public static int bap1(int arr[],int k){
    if(arr.length<k){
      return -1;
    }
    int s=1;
    int ans=-1;
    int sum=0;
    for(int i=0;i<arr.length;i++){
      sum+=arr[i];
    }
    int e=sum;
    int mid=0;
    while(s<=e){
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
    int arr[]={10,20,30,40,50};
    int k=2;
    int an=bap1(arr,k);
    System.out.println("the ans is =>"+an);
  }
}
