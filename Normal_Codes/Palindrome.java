public class Palindrome {
  public static void main(String arg[]){
        int n=908;
        int p=n;
        int reverse=0;
        while(n>0){
          int digit=n%10;
         reverse=(reverse*10)+digit;
         n=n/10;
        }
        System.out.print(reverse);
        if(p==reverse){
          System.out.println("THE NUMBER IS PALINDROME");
        }else{
          System.out.println("THE NUMBER IS NOT PALINDROME");
        }
      }
    }
    
