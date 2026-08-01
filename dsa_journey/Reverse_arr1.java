import java.util.Scanner;
class Reverse_arr1{
    public static void Reverse_arr(int n[]){
        int first=0,last=n.length-1;
        while(first<last){
            int temp=n[last];
            n[last]=n[first];
            n[first]=temp;
            first++;
            last--;
        }
        System.out.println("the reverse array is the : ");
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }
    public static void main(String arg[]){
        int[] n=new int[7];
        System.out.println("enter the 7 num for the array:");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
        }
        Reverse_arr(n);
    }
}