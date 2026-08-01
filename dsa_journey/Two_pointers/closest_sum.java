import java.util.Arrays;
class ClosetSum{
    public static void closestSum(int a[]){
        Arrays.sort(a);
        int min_sum=Integer.MAX_VALUE;
        int closest_sum=0;
        int n=a.length;
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            int target=14;
            int sum=0;
            while(left<right){
                 sum=a[i]+a[left]+a[right];
                int diff=Math.abs(sum-target);
                if(diff<min_sum){    
                    min_sum=diff;
                     closest_sum=sum;
                }if(sum<target){
                    left++;

                }else{
                    right--;
                }
            }
        }
        System.out.println("closest sum is="+closest_sum);
    }
    public static void main(String arg[]){
        int a[]={5,2,7,10,1};
        closestSum(a);
    }
}