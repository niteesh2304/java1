import java.util.*;

public class FindThePeak{
    public static void main(String [] args){
        int nums[] = {1,2,3,1};
        int i = 0;

        int peak = Integer.MIN_VALUE;

        while(i<nums.length){
            if(nums[i]>peak){
                peak = i;
            }
            i++;
        }
        System.out.println("The peak "+peak);
    }
}