class TargetE{
  public static int solve(int arr[],int target,int index){
    if(index>=arr.length){
      return 0;
    }
    int current=0;
    if(arr[index]==target){
      current=1;
    }
    return current+solve(arr, target, index+1);
  }
  public static void main(String arg[]){
    int arr[]={21,33,44,21,33,21,55};
    int target=21;
    int index=0;
    int ans=solve(arr,target,index);
    System.out.println(ans);
  }
}