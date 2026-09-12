public class Sum_D {
  public static int sum_D(int n){
    if(n==0){
      return 0;
    }
    return (n % 10)+sum_D(n/10);
  }
  public static void main(String arg[]){
    int n=3542;
    System.out.print(sum_D(n));
  }
}
