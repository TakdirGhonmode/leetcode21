class Duplicate{
    public static int fDuplicate(int a[],int d){
        int count=0;
        for(int i=0;i<a.length;i++){
             if(a[i]==d){
                count++;
                if(count==2){
                    return count;
                }
            }
        }
        // System.out.println("the num is found is atleast "+count);
        return count;
    }
    public static void main(String arg[]){
        int arr[]={34,43,3,4,3,4,323,5,43,43,4,43,634,32,24,64,231};
        int d=3;
        int result=fDuplicate(arr,d);
        if(result==0){
            System.out.println("the num is not availble");
        }else if(result==1){
            System.out.println("only once is found");
        }else{
            System.out.println("duplicate num is avilable bro: "+result);
        }
    }
}