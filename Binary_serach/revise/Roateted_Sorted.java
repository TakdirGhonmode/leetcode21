public class Roateted_Sorted{
  public static int search(int arr[],int target){
    int left=0;
    int ans=-1;
    int right=arr.length-1;
    while(left<=right){
      int mid=left+(right-left)/2;
      if(arr[left]<=arr[mid]){
        if(arr[left]<=target && target<arr[mid]){
            right=mid-1;
        }else{
          left=mid+1;
        }
      }else{
          if(target<=arr[right] &&target<arr[mid]){
            left=mid+1;
          }else{
            right=mid-1;
          }
      }
    }return ans;
  }
  public static void main(String[] args) {

    int[] arr = {4, 5, 6, 7, 0, 1, 2};

    int target = 0;

    int result = search(arr, target);

    System.out.println("Target index: " + result);
}
}