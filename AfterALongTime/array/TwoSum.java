public class TwoSum{
    public static void main(String args[]){
        int a[] = {3,4,5,6,2};
        int target = 7;

        for(int i = 0; i <= a.length-2;i++){
            
            int next = i+1;
            if(a[i]+a[next] == target){              
                System.out.println(i+","+next);
            }else{
                next++;
            }
        }
    }
}