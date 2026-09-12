public class Sum_N {
public static int sumN(int n){
  if(n==0){
    return 0;
  }
  return n+sumN(n-1);
}
  public static void main(String arg[]){
    System.out.println(sumN(5));
  }
}
