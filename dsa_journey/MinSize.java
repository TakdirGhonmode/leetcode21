class MinSize{
   public static int  minSize1(int a[],int t){
    int n=a.length;
    int distance=Integer.MAX_VALUE;
    int high=0;
    int low=0;
    int res=Integer.MIN_VALUE;
    while(high<n){
     int sum=a[low]+a[high];
     if(sum>=t){
        res=Math.max(res, sum);
        sum-=a[low];
        if(high==low){
            high++;
           }
        low++;
     }else{
        high++;
     }
     distance=Math.min(distance,high-low);
    }return distance;
   }
    public static void main(String arg[]){
        int arr[]={1,2,4,4};
        int target=4;
        int result=minSize1(arr,target);
        if(result==0)
            result++;
        System.out.println("the Min  sum is:->"+result);
    }
}