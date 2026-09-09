public class Painters_P{
  public static int painters_p(int array[],int k){
    int left=1;
    int right=0;
    int ans=0;
    for(int i=0;i<array.length;i++){
      right=right+array[i];
    }
    while(left<=right){
      int mid=left+(right-left)/2;
      if(isPossible(array,k,mid)){
        ans=mid;
        right=mid-1;
      }else{
        left=mid+1;
      }
    }
  return ans;
  }
  public static boolean isPossible(int array[],int k,int mid){
    int paintersCount=1;
    int currentSum=0;
    for(int i=0;i<array.length;i++){
      if(currentSum+array[i]<=mid){
        currentSum+=array[i];
      }else{
        paintersCount++;
        if(paintersCount>k || array[i]>mid){
          return false;
        }else{
          currentSum=array[i];
        }
      }
    }
    return true;
  }
  public static void main(String arg[]){
    int array[]={21,13,44};
    int k=2;
    int ans=painters_p(array,k);
    System.out.println("the ans is the=>"+ans);
  }
}
