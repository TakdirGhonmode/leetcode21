class Book_AP{
  public static int book_AP(int arr[],int k){
    int l=1;
    int h=0;
    int ans=-1;
    int sum=0;
    for(int i=0;i<arr.length-1;i++){
      sum=sum+arr[i];
    }
    h=sum;
    while(l<=h){
      int mid=l+(h-l)/2;
     if(isPossible(arr,k,mid)){
      ans=mid;
      h=mid-1;
     }else{
      l=mid+1;
     }
    }return ans;
  }
  public static boolean isPossible(int arr[],int k,int mid){
    int studentCount=1;
    int pages=0;
    for(int i=0;i<=arr.length-1;i++){
      if(pages+arr[i]<=mid){
        pages=pages+arr[i];
      }else{
        studentCount++;
        if(studentCount>k || arr[i]>mid){
          return false;
        }else{
          pages=0;
          pages=pages+arr[i];
        }
      }
    }return true;
  }
  public static void main(String arg[]){
    int array[]={12,34,67,90};
    int k=2;
    int ans=book_AP(array,k);
    System.out.println("the  ans is =>"+ans);
  }
}