public class Power {
  public static int power(int base,int exp){
    if(exp==0){
      return 1;
    }
    return base*power(base,exp-1);
  }
  public static void main(String arg[]){
    int base=2;
    int exp=3;
    System.out.println(power(base,exp));
  }
}
