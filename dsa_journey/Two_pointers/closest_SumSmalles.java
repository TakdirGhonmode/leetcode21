
import java.util.Arrays;

class closest_SumSmallest{
    public static void smallSum(int a[],int target){
        int n=a.length;
        Arrays.sort(a);
        int c_result=Integer.MAX_VALUE;
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum=Math.abs(a[i]+a[left]+a[right]);
                if(sum<target){
                    if(sum<c_result){
                        c_result=sum;
                    }
                }
            right--;
            }
        }
        System.out.println("the result we got the smallest num is:"+c_result);

    }
    public static void main(String arg[]){
      int array[]={54,534,32,53,2364,52,23};
      int target=32;
      smallSum(array,target);
    }
}