public class Rev_N {
 public static int rev_N(int n, int rev){
  if (n == 0) {
    return rev;
}
     int lastDigit = n % 10;
   return rev_N(n / 10, rev * 10 + lastDigit);
 }
  public static void main(String arg[]){
    int rev=234;
    System.out.print(rev_N(rev,0));
  }
}
