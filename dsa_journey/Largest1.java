class Largest1{
    public static void Largest(int a[]){
    int largestV=Integer.MIN_VALUE;
    int smallest=Integer.MAX_VALUE;
    for(int i=0;i<a.length;i++){
        if(largestV<a[i]){
            largestV=a[i];
        }
        if(smallest>a[i]){
          smallest=a[i];
            System.out.println();
        }
    }
    System.out.println("the largest num in the array is: "+largestV);
    System.out.println("the smallest num in the araay is : "+smallest);
    }
    public static void main(String arg[]){
        int a[]={3,43,2,4,32,33,65,465,54,36,323};
        Largest(a);
    }
}