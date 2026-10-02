import java.util.ArrayList;
import java.util.List;

public class PalindromePartition{
  public static void solve(String s,
    int index,
    List<String> currenList,
    List<List<String>> ans){
    if(index==s.length()){
      ans.add(new ArrayList<>(currenList));
      return;
      }
      for(int i=index;i<s.length();i++){
        if(isPalindrome(s,index,i)){
              currenList.add(s.substring(index,i++));
              solve(s, i+1, currenList, ans);
              currenList.remove(currenList.size()-1);
        }
      }
    }
      public static boolean isPalindrome(String s,int start,int stop){
        while(start<stop){
          if(s.charAt(start) !=s.charAt(stop)){
            return false;
          }
          start++;
          stop--;
        }
        return true;
      }
   public static void main(String[] args) {

        String s = "aab";

        List<String> current = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();

        solve(s, 0, current, ans);

        System.out.println(ans);
    }
}
