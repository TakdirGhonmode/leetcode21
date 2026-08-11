class Peak_i{
  public static void peak_i(int arr[]){
    int n=arr.length;
    int e=n;
    int s=1;
    int mid;
    int ans=-1;
    while(s<=e){
       mid=s+(e-s)/2;
       if(arr[mid]<arr[mid+1]){
        s=mid+1;
       }else{
        ans=mid;
        e=mid-1;
       }
    }
    System.out.println("The peak element is=>"+ans);
  }
  public static void main(String arg[]){
    int arr[]={1,3,5,4,2};
    peak_i(arr);
  }
}