public class Min{
    public static void main(String [] args){
        int nums[] = {10,15,20};
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            if(min>nums[i]){
                min = nums[i];
            }
        }
        System.out.println(min);
        int result = 0;
        
        for(int i = 0 ; i < nums.length ; i ++ ){
            
            if(nums[i]==min){
                result+=min;
            }
        }
        if(nums[0]==min){
                result-=min;
            }
        System.out.println(result);
    }
}