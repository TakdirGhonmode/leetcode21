public class Fibonaci {
  public static int fibonaci(int n){
    if(n==0){
      return 0;
    }
    if(n==1){
      return 1;
    }
    int ans=fibonaci(n-1)+fibonaci(n-2);
    return ans;
  }
  public static void main(String arg[]){
    int n=8;
    System.out.println(fibonaci(n));
  }
}
