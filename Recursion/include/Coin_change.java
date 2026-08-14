public class Coin_change {
  static int solve(int amount,int[] coins,int index){
    if(amount==0){
      return 1;
    }
    if(amount<0){
      return 0;
    }
    if(index>=coins.length){
      return 0;
    }
    int include=solve(amount-coins[index],coins,index);
    int exclude=solve(amount,coins,index+1);
    int finalAns=include+exclude;
    return finalAns;
  }
  public static void main(String arg[]){
    int coins[]={1,2,5};
    int amount=5;
    int index=0;
    int ans=solve(amount,coins,index);
    System.out.print(ans);
  }  
}
