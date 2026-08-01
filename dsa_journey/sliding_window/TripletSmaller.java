
class TripletSmaller{
    public static void TripletSmallest(int a[],int t){
        int n=a.length;
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            int sum=a[i]+a[left]+a[right];
            if(sum==t){
                System.out.println("("+a[i]+","+a[left]+","+a[right]+")");
                left++;
                right--;
            }
            if(sum<t){
                while(left!=right){
                    System.out.println("("+a[i]+","+a[left]+","+a[right]+")");
                    right--;
                }
                if(sum>t){
                    right--;
                }
            }
        }
    }
    public static void main(String arg[]){
        int array[]={-2,0,1,3};
     int target=13;
     TripletSmallest(array,target);
             
    }
}/*import java.util.Arrays;

class TripletSmaller {

    public static void TripletSmallest(int a[], int target) {

        Arrays.sort(a);

        int n = a.length;

        for(int i = 0; i < n - 2; i++) {

            int left = i + 1;
            int right = n - 1;

            while(left < right) {

                int sum = a[i] + a[left] + a[right];

                if(sum < target) {

                    // all triplets from left to right are valid
                    for(int k = right; k > left; k--) {

                        System.out.println(
                            "(" + a[i] + "," + a[left] + "," + a[k] + ")"
                        );
                    }

                    left++;
                }
                else {

                    right--;
                }
            }
        }
    }

    public static void main(String arg[]) {

        int array[] = {-2,0,1,3};

        int target = 2;

        TripletSmallest(array, target);
    }
}
     */