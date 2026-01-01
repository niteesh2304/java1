import java.util.Arrays;
//914

public class DeckOfCards{
    public static void main(String args[]){
        int nums[]= {1,2,3,4,4,3,2,1};
        int max = max(nums);
        int king[]= new int[max+1];
        for(int i =0;i<king.length;i++){
            king[nums[i]]++;
        }
        System.out.println(Arrays.toString(king));
    }
    public static int max(int nums[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;
    }
}