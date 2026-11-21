public class Closest {
  public static int closest(int arr[],int target){
    int left=0;
    int right=arr.length-1;
    int mid=0;
    if(arr.length==0){  //if the length 0
      return -1;
    }
    while(left<=right){
    mid=left+(right-left)/2;
    if(arr[mid]==target){
      return arr[mid];
    }
    if(arr[mid]<target){
      left=mid+1;
    }
    if(arr[mid]>target){
      right=mid-1;
    }
    }
    if(right<0) return arr[left]; //if out of bound (bigger target)
    if(left>=arr.length) return arr[right]; //out of bound (Smaller target)
    long leftDiff=(long) target-arr[right]; //left diff cal
    long rightDiff=(long) arr[left]-target;  //right diff cal
    if(leftDiff<=rightDiff){
       return arr[right]; //sending the low value
    }else{
      return arr[left]; //sending the low value
    }
  }
  public static void main(String arg[]){
   int arr[]={10,20,30,40,50,60};
   int target=70;
   int ans=closest(arr,target);
   System.out.println("The Target closest value is:-> "+ans);
  }
}
