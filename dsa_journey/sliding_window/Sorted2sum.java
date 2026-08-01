class Sorted{   
        public int TwoSum(int a[]){
        int result;
        int i=a[0];
        int j=a.length-1;
        int target=96;
        int t=0;
        while(i<=j){
            int sum=a[i]+a[j];
            if(sum==target){
                t=1;
                return {i,j};
            }else if(sum<target){
                j--;
            }else{
                i++;
            }
        }
     if(t==1){
        System.out.println("the sum is not found: so  sooryy");
     }
}
    public static void main(String arg[]){
        int[] a={32,42,54,65,68,77,78};
        int result=TwoSum(a[]);
        
    }
}