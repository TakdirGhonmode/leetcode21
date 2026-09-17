public class HouseRobbar {
  public static int hRfun(int arr[],int index){
       if(index>=arr.length){
        return 0;
       }
       int include=arr[index]+hRfun(arr, index+2);
       int exclude=0+hRfun(arr, index+1);
       int max=Math.max(include, exclude);
       return max;
  }
  public static void main(String arg[]){
    int arr[]={2,7,9,3,1};
    int index=0;
    System.out.println(hRfun(arr,index));
  }
}
