class Palindrome_No{
  public static void main(String arg[]){
    int n=943;
    int digit;
    int rev=0;
    int original=n;
    System.out.print("the original no is :->");
    while(n>0){
      digit=n%10;
      rev=(rev*10)+digit;
      n=n/10;
    }
    System.out.println("the reverse element is:->"+rev);
    if(rev==original){
      System.out.println("the num is palindrome");
    }else{
      System.out.println("THE NUM IS NOT PALINDROME");
    }
  }
}