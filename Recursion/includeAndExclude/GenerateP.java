import java.util.ArrayList;
import java.util.List;

public class GenerateP{
  public static void solve(int n,int open,int close,String current,List<String> ans){
    //base case when the colse and the open is equal to the n
    if(open==n && close==n){
      //ans is ready for storing
      ans.add(current);
      return;
    }
    //we start with the open paranthisis till the n
    if(open<n){
      solve(n, open+1, close, current+"(", ans);
    }
    //we now start the close till the open
    if(close<open){
      solve(n, open, close+1, current+")", ans);
    }
  }
   public static void main(String[] args) {
        int n = 3;
        List<String> ans = new ArrayList<>();
        solve(n, 0, 0, "", ans);
        System.out.println(ans);
    }
}