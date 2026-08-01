
import java.util.Arrays;
class Twice1{
    public static boolean  TwiceC(int array[]){
          int n=array.length;
          Arrays.sort(array);
          for(int i=0;i<n-1;i++){
            if(array[i]==array[i+1])
               return true; 
          }
          return false;
          //creating first method           
        //   for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(array[i]==array[j]){
        //             return true;
        //         }
        //     }
        //   }
        //   return false;
    }
    public static void main(String arg[]){
        int array[]={43,29,53,5,43,34,76,33,6,24};
        System.out.println(TwiceC(array));

    }
}