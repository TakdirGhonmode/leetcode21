public class TwoF {
  public static int twoF(int n){
    if(n==0){
      return 1;
    }
    int first=twoF(n-1);
    int second=twoF(n-1);
    return first+second;
  }
  public static void main(String arg[]){
    System.out.println("ans is=>"+(twoF(5)));
  }
}
