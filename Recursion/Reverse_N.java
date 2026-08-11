public class Reverse_N{
  public static int reverse_N(int n,int rev){
    if(n==0){
      return rev;
    }
    int digit=n%10;
     rev=(rev*10)+digit;
   return reverse_N(n/10,rev);
  }
 public static void main(String arg[]){
      int an=reverse_N(213,0);
      System.out.println("The Reverse nu is:->"+an);
 } 
}
