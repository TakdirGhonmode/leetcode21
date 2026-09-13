public class Natural{
  public static void  natuaralN(int n){
    if(n==0){
      return ;
    }
    natuaralN(n-1);
    System.out.println("the No=>"+n);
  } 
  public static void main(String arg[]){
    int n=9;
    natuaralN(n);
  }
}
