class MinPoints{
    public static int minP(int a[],int t){
      int lefts=0;
      int rights=0;
      int maxs=0;
      int sum=0;
      for(int i=0;i<=t-1;i++){
        lefts+=a[i];
      }maxs=lefts;
      int rinde=a.length-1;
      for(int i=t-1;i>=0;i--){
        lefts=lefts-a[i];
        rights=rights+a[rinde];
        rinde=rinde-1;
        maxs=Math.max(maxs,lefts+rights);
      }
      return maxs;
    }
    public static void main(String arg[]){
        int arr[]={6,2,3,4,7,2,1,7,1};
        int target=4;
        int result=minP(arr,target);
        System.out.println("the Maxpoints obtain from: "+result);
    }
}