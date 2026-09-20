public class CoinChange2 {
  public static int solve(int arr[],int amount){
    if(amount==0){
      return 0;
    }
    if(amount<0){
      return Integer.MAX_VALUE;
    }
    int min=Integer.MAX_VALUE;
    for(int coin:arr){
      int arrayAns=solve(arr,amount-coin);
      if(arrayAns !=Integer.MAX_VALUE){
        int ans=arrayAns+1;
        min=Math.min(min,ans);
      }
    }
    return min;
  }
  public static void main(String arg[]){
    int arr[]={1,2,5};
    int amount=11;
    int ans=solve(arr,amount);
    if(ans==Integer.MAX_VALUE){
      System.out.println("the ans is =>"+(-1));
    }else{
      System.out.println("the ans is =>"+ans);
    }
  }
}
