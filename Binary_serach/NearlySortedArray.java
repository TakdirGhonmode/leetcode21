public class NearlySortedArray {
  public static int nearlySortedArray(int arr[],int target){
    int left=0;
    int right=arr.length-1;
    
    while(left<=right){
      int mid=left+(right-left)/2;
      if(arr[mid]==target){
        return mid;
      }
      if(arr[mid+1]==target){
        return mid+1;
      }
      if(arr[mid-1]==target){
        return mid-1;
      }
      if(arr[mid]<target){
        left=left+2;
      }else{
        right=right-2;
      }
    }
    return -1;
  }
  public static void main(String arg[]){
    int[] arr = {10, 3, 40, 20, 50, 80, 70};
    int target = 50;
    nearlySortedArray(arr,target);
  }
}
