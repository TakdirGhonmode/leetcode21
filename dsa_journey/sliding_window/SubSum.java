class SubSum{
    public static int subarray(int array[],int w){
       int currentS=0;
       if(w>array.length){
        return -1;
       }
       for(int i=0;i<w;i++){
        currentS+=array[i];
       }
       int maxS=currentS;
       for(int i=1;i<=array.length-w;i++){
        currentS=currentS-array[i-1]+array[i+w-1];
        if(currentS>maxS){
            maxS=currentS;
        }
       }return maxS; 
    }
    public static void main(String arg[]){
        int[] array={3,2,32,5,4,12};
        int w=4;
        int result=subarray(array,w);
        System.out.println("the sum of the max sub array is ="+result); 
    }
}