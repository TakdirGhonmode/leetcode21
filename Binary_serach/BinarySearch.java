class BinarySearch{
  static int binarySearch(int nums[],int target){
     int l=0;
     int r=nums.length-1;
     int mid;
     while(l<=r){
      mid=l+(r-l)/2;
      if(nums[mid]==target){
        return mid;
      }else if(nums[mid]<target){
        l=mid+1;
      }else{
        r=mid-1;
      }
     }
    return -1;
  }
  public static void main(String[] args) {
   int[] array={21,24,35,67,68,73,75,78};
   int target=67;
   int result=binarySearch(array,target); 
   System.out.println("The target is find in the index no:-> "+result);
  }
}