class PracticeA{
    public static int[] twoSump(int array[] , int target){
          int left=0;
          int right=array.length-1;
          while(left<right){
            int currentSum=array[left]+array[right];
            if(currentSum==target){
                System.out.println("the target is found of the two num is=("+array[left]+","+array[right]+")");
                return new int[]{left,right};
            }else if(currentSum<target){
                left++;
            }else{
                right--;
            }
          }return new int[]{-1,-1};
}
    public static void main(String args[]){
        int[] array={4,6,7,25,29,31,41,65,67,68};
        int target=49;
        int result[]=twoSump(array,target);
        if(result[0]!=-1){
            System.out.println("the index of the two num is =("+result[0]+","+result[1]+")");
        }else{
            System.out.println("the result is not available in the sum");
        }
        
    }
}