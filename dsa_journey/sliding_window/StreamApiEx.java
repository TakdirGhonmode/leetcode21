import java.util.Arrays;
import java.util.List;
class StreamApiEx{
    public static void main(String arg[]){
        List<Integer> l=Arrays.asList(2,4,3,5,5,6,8);
        l.forEach(n->System.out.println(n));
        //  for(int i=0;i<l.size();i++){
        //     System.out.println("the num is present: "+l.get(i));
        //  }


        //  for(int a:l){
        //     System.out.println("\n the num using the forEach loop:  "+a);
        //  }
        // int sum=0;
        // for(Integer a:l){
        //     if(a%2==0){
        //         a=a*2;
        //         sum=sum+a;
        //     }
        // }
        // System.out.println("the addition of even it :"+sum);
    }
}