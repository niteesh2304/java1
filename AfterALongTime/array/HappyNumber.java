public class HappyNumber{
    public static void main(String [] args){
        int n = 19;
        boolean t = true;
        while(t){
            int digit = divide(n);
            n = digit;
            if(digit<=9){
                t = false;
            }
        }
        System.out.print(divide(n));
    }
    public static int divide(int n){
        int res=0;
        while(n != 0){
            int last = n%10;
            res = res + (last*last);
            n/=10;
        }
        return res;
    }


}