import java.util.Scanner;
class Largest{
    public static void Largest(int n[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
            for(int i=0;i< n.length;i++){
                if(n[i]>largest){
                    largest=n[i];
                }
                if(n[i]<smallest){
                    smallest=n[i];
                }
            }
            System.out.println("largest num is:"+largest);
            System.out.println("Smallest num is:"+smallest);
    }
    public static void main(String arg[]){
        int n[]=new int[6];
        System.out.println("enter the 7 num for the array:");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
        }
        Largest(n);
    }
}