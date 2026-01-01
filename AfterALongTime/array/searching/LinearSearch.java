import java.util.Arrays;

public class LinearSearch{
    public static void main(String args[]){
        int f[] = {10,20,30,40,50};
        int target = 50;
        for(int i = 0;i<f.length;i++){
            if(f[i]==target){
                System.out.print("present in index: "+i);
            }
        } 
    }
}