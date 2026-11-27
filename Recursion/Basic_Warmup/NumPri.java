public class NumPri {
  public static void prinN(int n){
    if(n==0){
      return;
    }
    prinN(n-1);
    System.out.println("n=>"+n);
  }
  public static void main(String arg[]){
    prinN(5);
  }
}
