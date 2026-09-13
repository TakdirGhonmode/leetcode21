public class Fact {
  public static int fact_N(int n){
    if(n==0){
      return 1;
    }
    return n*fact_N(n-1);
  }
  public static void main(String arg[]){
    int n=4;
    int fact=1;
      System.out.print(fact_N(n));
  }
}
