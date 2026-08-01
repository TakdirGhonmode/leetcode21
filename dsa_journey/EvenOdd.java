class EvenOdd{
    public static void evenOddC(int array[]){
        int even=0;
        int odd=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("the even num count is ="+even+"\n the odd num count is="+odd);
    }
    public static void main(String arg[]){
        int[] array={43,-5,42,76,-45,23,75,-12};
        evenOddC(array);
    }
}