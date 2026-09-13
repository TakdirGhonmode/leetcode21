public class Count{
  public static int count(int n){
    if(n==0){
      return 0;
    }
    return 1+count(n/10);
  }
  public static void main(String arg[]){
    int n=213;
    System.out.println(count(n));
  }
}
