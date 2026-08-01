class SortedEx{   
        public static void TwoSum(int a[]){
        int result;
        int i=0;
        int j=(a.length)-1;
        int target=876;
        int t=0;
        while(i<j){
            int sum=a[i]+a[j];
            if(sum==target){
                t=1;
                System.out.print("found at the index"+i+"   and "+j);
                break;
            }if(sum<target){
                i++;
            }if(sum>target){
                j--;
            }
        }
     if(t==0){
        System.out.println("the sum is not found: so  sooryy"+i+"  "+j);
     }
}
    public static void main(String arg[]){
        int[] a={32,42,54,65,68,77,78};
        TwoSum(a);
        
    }
}