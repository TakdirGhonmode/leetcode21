import java.util.Scanner;
class Pairs{
    public static void Pairs1(int n[]){
            for(int i=0;i< n.length;i++){
                int current=n[i];
                for(int j=i+1;j< n.length;j++){
                    System.out.print("( "+n[i]+","+n[j]+")");
                }
                System.out.println("");
            }
    }
    public static void main(String arg[]){
        int n[]=new int[6];
        System.out.println("enter the 7 num for the array:");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
        }
        Pairs1(n);
    }
}