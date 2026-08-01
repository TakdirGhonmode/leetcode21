
class LinearSearch{
    public static int LinearSearch1(int[] a,int t){
        for(int i=0;i<a.length;i++){
            if(a[i]==t){
                return i;
            }
        }return -1;
    }
    public static void main(String arg[]){
     int a[]={32,43,55,65,76,76,78,87,89};
     int target=32;
    int result=LinearSearch1(a,target);
    if(result==-1){
        System.out.println("the element is not found in the array:->");
    }else{
        System.out.println("the result is found in the array index:->"+result);
    }
    }
}