import java.util.Scanner;
import java.util.Arrays;
public class PlusOne{
    static Scanner sc = new Scanner(System.in);
    public static void main(String []args){
        int size = sc.nextInt();
        int arr[] = new int[size];
        array(arr);
        int digits = 0;
        for(int i = 0 ; i < arr.length ;i++){
            digits = digits * 10 + arr[i];
        }
        
        digits+=1;
        int count = count(digits);
        if(count==arr.length){
            for(int i = arr.length-1 ; i>=0;i--){
                arr[i] = digits%10;
                digits/=10;
            }
            System.out.print(Arrays.toString(arr));
            
        }else if(count>arr.length){
            int arr1[] = new int[count];
            for(int i = arr1.length-1 ; i>=0;i--){
                arr1[i] = digits%10;
                digits/=10;
            }
            System.out.print(Arrays.toString(arr1));
        }
        
        System.out.println();
        

        

    }
    public static int count(int sum){
        int temp  = sum;
        int count =0;
        while(temp >0){
            temp /=10;
            count++;
        }
        return count;
    }
    public static void array(int []arr){
        for(int i = 0 ; i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
    }
}