import java.util.ArrayList;
import java.util.List;

public class SubSequenceR {
  public static void solve(int arr[],int index,List<Integer> output){
      if(index>=arr.length){
        System.out.println(output);
        return;
      }
      output.add(arr[index]);
      solve(arr, index+1, output);
      output.remove(output.size()-1);
      solve(arr, index+1, output);
  }
  public static void main(String[] arg){
    int arr[]={1,2,3};
    int index=0;
    solve(arr,index,new ArrayList<>());
  }
}
