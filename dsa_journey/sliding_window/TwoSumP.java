class TwoSumP{
    public static int[] twoSumP(int array[],int target){      
        int left=0;
        int right=array.length-1;
        while(left<right){ 
            int currentSum=array[left]+array[right];
            if(currentSum==target){
                System.out.println("the pair of the two value:("+array[left]+","+array[right]+")");
               return new int[]{left,right};
            }else if(currentSum<target){
                left++;
            }else{
                right--;
            }
 
        }
        return new int[]{0};
    }
    public static void main(String arg[]){
        int[] n={1,2,3,4,5,7,9,11,12,13,23,39};
        int target=20;
        int result[]=twoSumP(n,target);
        System.out.println("the result is found in the index of :("+result[0]+","+result[1]+")");
    }
}