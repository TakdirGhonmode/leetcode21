import java.util.Arrays;
class Rduplicate{
    public static void rduplicateE(int n[]){
        Arrays.sort(n);
        for(int i=0;i<n.length-1;i++){
          if(n[i]==n[i+1]){
            for(int j=i;j<n.length-1;j++){
                n[j]=n[j+1];
            }
            break;
          }
        }
        for(int i=0;i<n.length-1;i++){
            System.out.print(" "+n[i]);
        }
    System.out.println("");
}

    public static void main(String arg[]){
        int[] n={435,65,32,54,43,65};
        rduplicateE(n);
    }
}