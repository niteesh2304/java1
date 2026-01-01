//positive single number
import java.util.Arrays;
public class Trash{
    public static void main(String args[]){

        int a[] = {4,1,2,1,2};
        int max = max(a);
        int arr[] = new int[max+1];
        for(int i = 0 ; i < arr.length;i++){
            arr[a[i]]++;
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==1){
                System.out.print(i);
            }
        }
    }
    public static int max(int a[]){
        int max = Integer.MIN_VALUE;
            for(int i =0;i<a.length;i++){
                if(a[i]>max){
                    max = a[i];
                }
            }
        return max;
    }
}