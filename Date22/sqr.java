package dsa;

public class sqr {
    public static int mySqrt(int x) {
        if(x==0){
            return x;
        }
        int f=1,last=x;
        while(f<=last){
            int mid=f+(last-f)/2;
            int s=x/mid;
            if(mid == x/mid){
                return mid;
            }
            else if(mid>x/mid){
                last=mid-1;
            }
            else{
                f=mid+1;
            }
        }
        return last;
    }
    public static void main(String[] args) {
        int n=25;
        int res=mySqrt(n);
        System.out.println(res);
        System.out.println(Math.sqrt(8));

    }
}
