
import java.util.ArrayList;
import java.util.Collections;

public class SubSequence {
  public static void subSequence(String s,int index,StringBuilder out,ArrayList<String> ans){
     if (index>=s.length()){
      String subs=out.toString();
      ans.add(subs);
      return ;    
     }
    char ch=s.charAt(index);
    out.append(ch);
    subSequence(s, index+1, out, ans);
    out.deleteCharAt(out.length()-1);
    subSequence(s, index+1, out, ans);
  }
  public static void main(String arg[]){
    ArrayList<String> ans=new ArrayList<>();
    int index=0;
     StringBuilder out=new StringBuilder();
     String s="abc";
     subSequence(s, index,out, ans);
     Collections.sort(ans);
     System.out.println(ans);
  }
}
