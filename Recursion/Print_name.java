public class Print_name {
  public static void print_name(int n){
    if(n==0){
      return;
    }
    System.out.println("The Name is Takdir");
    print_name(n-1);
  }
  public static void main(String arg[]){
    print_name(5);
  }
}
