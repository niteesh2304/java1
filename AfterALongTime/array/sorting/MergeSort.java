import java.util.*;

public class MergeSort{
    public static void main(String args[]){
        int[] digits = {7,1,4,3,8,11};
        Divide(digits,0,digits.length);
        System.out.println(Arrays.toString(digits));
    }
    public static void Divide(int []digits,int l,int h){
        int m = (l+h)/2;
        if(l==h){
            return;
        }
        Divide(digits,l,m);
        Divide(digits,m+1,h);
        Merge(digits,l,m,h);
    }
    public static void Merge(int []digits,int l,int m,int h){
        
    }
}














