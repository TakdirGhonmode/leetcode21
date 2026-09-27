public class LastOccurence {
  public static int solve(int arr[],int target,int index){
    if(index>=arr.length){
      return -1;
    }
    int remain=solve(arr,target,index+1);
    if(arr[index]==target){
      return Math.max(remain, index);
    }
    return remain;
  }
  public static void main(String arg[]){
    int arr[]={12,23,4,31,14,11,2,12,21,12};
    int target=12;
    int index=0;
    System.out.println("The ans of the last occurence is=>"+solve(arr,target,index));
  }
}
