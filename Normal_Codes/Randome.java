import java.util.Random;
public class Randome {
  public static void main(String arg[]){
    int n=1;
    Random s=new Random();
    int k=s.nextInt(100)+1;
    System.out.println(k);
    if(n==k){
     System.out.println("sdfa");
    }else{
     System.out.print("ds");
    }
  }
}
