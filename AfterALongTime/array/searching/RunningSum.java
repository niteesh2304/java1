import java.util.Arrays;

public class RunningSum{
    public static void main(String args[])
    {
        int []nums = {3,1,2,10,1};

        for(int i=1,j=i;i<nums.length;i++)
        {
            nums[i] = nums[i]+nums[i-1];
        }
        System.out.print(Arrays.toString(nums));
    }
}