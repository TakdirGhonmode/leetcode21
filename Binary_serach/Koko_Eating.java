class Koko_Eating{
  public static int koko_Eating(int arr[],int h){
    int low=0;
    int high=-1;
    for(int i:arr){
       high=Math.max(high,i);
    }
    while(low<=high){
      int mid=low+(high-low)/2;
      if(isPossible(arr,h,mid)){
        high=mid-1;
      }else{
        low=mid+1;
      }
    }
   return low;
  }
  private static boolean isPossible(int arr[],int h,int mid){
    long hourse=0;
    for(int a:arr){
      hourse+=(a+mid-1)/mid;
    }
    return hourse<=h;
  }
  public static void main(String s[]){
    int array[]={3,6,7,11};
    int h=8;
    int ans=koko_Eating(array,h);
    System.out.println("the ans is the -=>"+ans);
  }
}