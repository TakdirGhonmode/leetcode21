class SumSub{
    public static int SumSubFin(int n[]){
        int windowSum=0;
        int windowMax=Integer.MIN_VALUE;
        int k=2;
        int len=n.length;
        for(int i=0;i<k;i++){
            windowSum+=n[i];
            windowMax=windowSum;
        }
       for(int i=k;i<len;i++){
            windowSum=windowSum+n[i]-n[i-k];
            windowMax=Math.max(windowMax, windowSum);
       }return windowMax;
    }
    public static void main(String arg[]){
        int arr[]={12,32,44,54,6,34,34,54,65,4,65,3,43};
        int result=SumSubFin(arr);
        System.out.println("The largest is ="+result);
    }
}