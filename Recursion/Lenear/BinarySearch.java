public class BinarySearch{
  public static int binarySearch(int arr[],int s,int e,int mid,int target){
    mid=s+(e-s)/2;
   if(arr[mid]==target){
       return mid;
   }
    if(s>e){
       return -1;
   }
   if(arr[mid]>target){
       e=mid-1;
   }
   if(arr[mid]<target){
       s=mid+1;
   }
 
   return  binarySearch(arr,s,e,mid,target);
}
public static void main(String[] args) {
   int arr[]={2,4,6,7,8,12,13,15,18,24,26,29,49};
   int target=12;
   int s=0;
   int e=arr.length-1;
   int mid=0;
   System.out.println(binarySearch(arr,s,e,mid,target));
}
}