public class FirstO{
  public static int solve(int arr[],int index,int target){
    if(index>=arr.length){
      return -1;
    }
    if(arr[index]==target){
      return index;
    }
    return solve(arr, index+1, target);
  }
  public static void main(String arg[]){
    int arr[]={1,12,43,44,43};
    int index=0;
    int target=43;
    System.out.print(solve(arr,index,target));
  }
}
