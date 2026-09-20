public class CointC {
  public static int solve(int arr[],int amount,int index){
    if(amount==0){
      return 1;
    }
   if(amount<0){
    return 0;
   }
    if(index>=arr.length){
      return 0;
    }
  
    int include=solve(arr,amount-arr[index],index);
    int exclude=solve(arr,amount,index+1);
    return include+exclude;
  }
  public static void main(String arg[]){
    int arr[]={1,2,5};
    int amount=5;
    System.out.println(solve(arr,amount,0));
  }
}
