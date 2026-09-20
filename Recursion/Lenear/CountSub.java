import java.util.ArrayList;

public class CountSub {
  public static int solve(int arr[],int index,int target,int sum,ArrayList<Integer> list){
    if(index==arr.length){
      if(target==sum){
        System.out.println(list + " => sum = " + sum);
        return 1;
      }else{
        return 0;
      }
    }


    // PICK
    list.add(arr[index]);
    int include = solve(arr, index + 1, target,
                        sum + arr[index], list);
    // BACKTRACK
    list.remove(list.size() - 1);
    int exclude = solve(arr, index + 1, target, sum, list);
    return include+exclude;
  }
  public static void main(String arg[]){
    int arr[]={1,2,3};
    int index=0;
    int target=3;
    int sum=0;
     ArrayList<Integer> list = new ArrayList<>();
    System.out.println(solve(arr,index,target,sum,list));
  }
}
