public class AllStringP {
  public static void solve(int index,String s){
    if(index>=s.length()){
      return;
    }
    solve(index+1,s);
    System.out.println(s.charAt(index));
  }
      public static void main(String arg[]){
        int index=0;
        String greet="Hellow Bhai Log";
        solve(index,greet);
      }   
}
