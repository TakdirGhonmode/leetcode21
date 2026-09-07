public class Square{
  public static int findSquare(int nu){
    long r=nu;
   long l=0;
    long ans=-1;
    while(l<=r){
      long mid=l+(r-l)/2;
      if(mid*mid==nu){
        return (int)mid;
      }
      else if(mid*mid>nu){
        r=mid-1;
      }else if(mid*mid<nu){
        ans=mid;
        l=mid+1;
      }
    }return (int)ans;
  }
  public static void main(String arg[]){
    int nu=64;
    int ans=findSquare(nu);
    System.out.println("The ans=>"+ans);
  }
}
