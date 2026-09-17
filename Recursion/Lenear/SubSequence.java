public class SubSequence {
  public static void subSequence(String str,int index,String ans){
     if(index==str.length()){
      System.out.println(ans);
      return;
     }
     //Taking Bro
     subSequence(str, index+1,ans+str.charAt(index));
     subSequence(str, index+1, ans);
  }
  public static void main(String arg[]){
    String str="abc";
    int index=0;
    String ans="";
    subSequence(str, index, ans);
  }
}
