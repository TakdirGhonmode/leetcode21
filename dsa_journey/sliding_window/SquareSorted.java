//two pointers sorted array
// class SquareSorted{
//     public static void main(String arg[]){
//         int i=0;
//         int j=0;
//         int[] pos=new int[5];
//         int[] neg=new int[6];
//         int[] n={-9,-8,-7,-6,-3,-1,0,5,6,7,8};
//         int[] sorted=new int[11];
//         for(int k:n){
//            System.out.println("  "+k);
//         }
//         int t=0;
//         int h=0;
//         for(int k:n){
//             if(k>=0){
//                 pos[t]=k;
//                 t++;
//             }else{
//                 neg[h]=k;
//                 h++;
//             }
//         }
//         t=0;
//         h=0;
//         for(int k:pos){
//             pos[t]=k*k;
//             t++;
//         }
//         for(int k:neg){
//             neg[h]=k*k;
//             h++;
//         }
//         System.out.println("positive num list");
//         for(int k:pos){
//             System.out.println(" "+k);
//         }
//         System.out.println("negative num list");
//         for(int k:neg){
//             System.out.println(" "+k);
//         }
//         int start = 0;
//         int end = neg.length - 1;

//         while(start < end){

//             int temp = neg[start];
//             neg[start] = neg[end];
//             neg[end] = temp;

//             start++;
//             end--;
//         }
//         int l=0;
//         while(i<pos.length && j<neg.length){
//             if(neg[j]<pos[i]){
//               sorted[l]=neg[j];
//               j++;  
//             }else{
//                 sorted[l]=pos[i];
//                 i++;
//             }
//             l++;
//         }
//         while(i<pos.length){
//             sorted[l]=pos[i];
//             i++;
//             l++;
//         }
//         while(j<neg.length){
//             sorted[l]=neg[j];
//             j++;
//             l++;
//         }
//         System.out.println("the sorted element is found like this: ");
//         for(int k:sorted){
//                System.out.print("  "+k);
//         }
//     }
// }
import java.util.Arrays;

class SquareSorted {

    public static void main(String[] args) {

        int[] arr = {-9,-8,-7,-6,-3,-1,0,5,6,7,8};

        int[] ans = new int[arr.length];

        int left = 0;
        int right = arr.length - 1;

        int k = arr.length - 1;

        while(left <= right){

            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];

            if(leftSquare > rightSquare){

                ans[k] = leftSquare;
                left++;
            }
            else{

                ans[k] = rightSquare;
                right--;
            }

            k--;
        }

        System.out.println(Arrays.toString(ans));
    }
}
