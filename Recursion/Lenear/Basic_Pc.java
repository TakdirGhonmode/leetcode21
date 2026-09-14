public class Basic_Pc{
  public static void naturalNp(int n){
    if(n==0){
      return ;
    }
    naturalNp(n-1);
    System.out.println(n);
  }
  public static void main(String arg[]){
    int n=5;
    naturalNp(n);
  }
}
