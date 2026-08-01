import java.util.Scanner;
class Twice{
    public static void TwiceC(int array[],int h){
        int l=0;
          int n=array.length;
          for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(array[i]==array[j] && h==array[j]){
                        System.out.println("the num "+h+" is found twice at the "+j+" posiotion");
                        l=1;
                        break;
                }
            }
          }
          if(l==0){
            System.out.println("the num is not found twice in the array= "+h);
        }
    }
    public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
        int array[]={43,24,53,5,34,76,33,6,24};
        System.out.println("Enter the number you want to find the duplication:");
        int h=sc.nextInt();
        TwiceC(array,h);
    }
}