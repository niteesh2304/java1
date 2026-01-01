
public class SingleNumber{

    public static void main(String args[]){
        int nums[] = {4,2,1,2};
        int result =0;
        for(int i=0;i<nums.length;i++){
            int count = 0;
            for(int j =i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count<=1){
                result = nums[i];
            }
        }
        System.out.print(result);
    }
}