import java.util.Scanner;
class Natural_No{
  public static void main(String arg[]){
    Scanner a=new Scanner(System.in);
    int n;
    System.out.println("Enter the 1 to num range :->");
    n=a.nextInt();
    for(int i=1;i<=n;i++){
      System.out.println(i);
    }
  }
}