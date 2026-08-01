class NegativeP{
    public static void NegativeP(int array[]){
        int positive=0;
        int negative=0;
        for(int i=0;i<array.length;i++){

            if(array[i]>0){
                positive++;
            }
            else if(array[i]<0){
                negative++;
            }
        }
        System.out.println("the positive ="+positive+"\n the negative is =: "+negative);
    }
    public static void main(String arg[]){
        int[] n={45,7,54,43,43,-54,-5,-543,43,-6};
        NegativeP(n);
        // System.out.println("the result is :"+result);
    }
}