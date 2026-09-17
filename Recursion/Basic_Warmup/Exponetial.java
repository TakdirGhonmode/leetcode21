class Exponetial{
  public static int power(int a,int n){
    if(n==0){
      return 1;
    }
    return a*power(a,n-1);
  }
  public static void main(String arg[]){
    int n=3;
    int a=2;
    System.out.println("the ans of "+a+" power "+n+"=>"+power(a,n));
  }
}