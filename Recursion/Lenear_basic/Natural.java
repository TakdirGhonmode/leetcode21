public class Natural{
  public static void  natuaralN(int n){
    if(n==0){
      return ;
    }
    System.out.println("the No=>"+n);
    natuaralN(n-1);
  } 
  public static void main(String arg[]){
    int n=9;
    natuaralN(n);
  }
}
