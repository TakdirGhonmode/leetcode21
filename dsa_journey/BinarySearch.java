class BinarySearch{
    public static void BinarySearch(int a[],int key){
        int left=0;
        int right=a.length-1;
        while(left<=right){
         int mid=(left+right)/2;
         if(a[mid]==key){
            System.out.println("the num is foound in the index:->"+mid);
           break; 
        }else if (a[mid]<key){
            left=mid+1;
            
        }else{
            right=mid-1;
        }
        }
        }
    public static void main(String arg[]){
        int a[]={2,3,4,5,7,8,12,43,55,65,76,87,88,98};
        int target=3;
        BinarySearch(a,target);
    }
}