class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }return new int[0];
    }
    public static void main(String arg[]){
        int[] n={45,6,5,65,54,34,6,45,3,43};
        int target=11;
        int result[]=twoSum(n,target);
        System.out.println("the result index is =["+result[0]+","+result[1]+"]");
    }
}