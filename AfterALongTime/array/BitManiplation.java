public class BitManiplation{
    public static void main(String [] args){

        //fibonacci series
        int i = 1;
        int fib = 0;
        int prev = 1;
        int current = 1;
        while(i<7){
            fib = prev + current;
            prev = current;
            current = fib;
            i++;
        }
        System.out.println(fib);
    }
}