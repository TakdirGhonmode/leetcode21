public class BInarySearc {
  public static int binaryS(int arr[],int ta,int s,int e){
    if(s>e){
      return -1;
    }
    int mid=s+(e-s)/2;
    if(arr[mid]==ta){
      return mid;
    }else if(arr[mid]<ta){
      s=mid+1;
    }else{
      e=mid-1;
    }
    return binaryS(arr, ta, s, e);
  }
  public static void main(String arg[]){
    int arr[]={11,13,14,15,16,17,46,56,67,68,89};
    int ta=17;
    int ans=binaryS(arr,ta,0,arr.length-1);
    System.out.println(ans);
  }
  
}
