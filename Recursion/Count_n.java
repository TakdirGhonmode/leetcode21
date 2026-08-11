public class Count_n {
  public static void count_n(int n){
    if(n==0){
      return;
    }
    count_n(n-1);
    System.out.println("the  value is =>"+n);
  }
  public static void main(String arg[]){
    int count;
    count_n(8);
  }
}
