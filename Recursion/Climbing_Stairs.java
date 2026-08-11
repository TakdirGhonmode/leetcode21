class Climbing_Stairs{
  public static int climbing_Stairs(int n){
   if(n==1){
    return 1;
   }
   if(n==2){
    return 2;
   }
   int ans=climbing_Stairs(n-1)+climbing_Stairs(n-2);
  return ans;
  }
    public static void  main(String arg[]){
      int an=climbing_Stairs(7);
      System.out.println("The no of ways is:->"+an); 
    }  
}
