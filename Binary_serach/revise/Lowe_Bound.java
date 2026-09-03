class Lowe_Bound{
  public static int lower_Bound(int array[],int target){
    int start=0;
    int end=array.length-1;
    int mid;
    int ans=-1;
    while(start<end){
      mid=start+(end-start)/2;
      if(array[mid]>=target){
        ans=mid;
        end=mid-1;
      }else{
        start=mid+1;
      }
    }
    return ans;
  }
  public static void main(String args[]){
    int a[]={1,3,5,6,7,7,9,13,14};
    int ans=lower_Bound(a,12);
    System.out.println("ans="+ans);
  }
}