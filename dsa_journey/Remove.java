import java.util.Arrays;
class Remove{
public static int RemoveEle(int n[],int val){
    int k=0;
    for(int i=0;i<n.length;i++){
        if(n[i]!=val){
            n[k]=n[i];
            k++;
        }
    }
    return k;
}
    public static void main(String arg[]){
         int[] n={32,6,4,32,66,43,2,6,34,7,56,65,34,44};
        int val=34;
        int result=RemoveEle(n,val);
        System.out.println("the result is ="+result);
        System.out.println("the aray is :"+Arrays.toString(n));
    }
}