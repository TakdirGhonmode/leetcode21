import java.util.Scanner;
class SubArray{
    public static void SubArray1(int n[]){
            for(int i=0;i< n.length;i++){
                int start=i;
             for(int j=i+1;j< n.length;j++){
                    int end=j;
                    System.out.print(" (");
                    for(int k=start;k<=end;k++){
                    System.out.print(n[k]+",");
                }
                System.out.print(" )");   
              }
             System.out.println("");
            }
    }
    public static void main(String arg[]){
        int n[]=new int[6];
        System.out.println("enter the 6 num for the array:");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
        }
        SubArray1(n);
    }
}