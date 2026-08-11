public class BAP {
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
            pages=pages+arr[i];
          }
      }
    }
    return true;

}
  public static int bap(int arr[],int k){
    if(arr.length<k){
      return -1;
    }
    int sum=0;
    int s=0;
    int mid;
    int ans=-1;
    for(int i=0;i<arr.length;i++){
      sum+=arr[i];
    }
    int e=sum;
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
   public static void main(String aef[]){
    int arr[]={10,20,30,40,50};
    int k=2;
    int an=bap(arr,k);
    System.out.print(an);
   }  
}
