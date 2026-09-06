public class Square{
  public static int findSquare(int nu){
    int r=nu;
    int l=0;
    int ans=-1;
    while(l<=r){
      int mid=l+(r-l)/2;
      if(mid*mid==nu){
        return ans;
      }
      else if(mid*mid>nu){
        r=mid-1;
      }else if(mid*mid<nu){
        ans=mid;
        l=mid+1;
      }
    }return ans;
  }
  public static void main(String arg[]){
    int nu=64;
    int ans=findSquare(nu);
    System.out.println("The ans=>"+ans);
  }
  
}
