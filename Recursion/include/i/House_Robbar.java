class House_Robbar {
  public static int house_robbar(int arr[],int index){
    //base case
    if(index>=arr.length){
      return 0;
    }
    int include=arr[index]+house_robbar(arr, index+2);
    int exclude=0+house_robbar(arr, index+1);
    int ans=Math.max(include,exclude);
    return ans;
  }
  public static void main(String arg[]){
    int arr[]={1,2,3,1};
    int index=0;
    int ans=house_robbar(arr,index);
    System.out.print(ans);
  }  
}