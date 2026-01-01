//  Question is write a code to find the number of rotation 


public class rotation{

    public static void main(String args[]){
        int arr1 [] = {1,2,3,4,5};
        int arr2 [] = {3,4,5,1,2};
        boolean x = true;
        int count = 1;

        while(!isSame(arr1,arr2)){
            left(arr1);
            count++;
        }
        System.out.println(count);
    }
    public static boolean isSame(int arr1[],int arr2[]){
        if(arr1.length!=arr2.length){
            return false;
        }
        for(int i = 0 ; i < arr1.length ; i++){
            
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }

    public static int[] left(int arr1[]){
        int temp = arr1[0];
        for(int i = 0 ; i < arr1.length-1;i++){
            arr1[i] = arr1[i+1];

        }
        arr1[arr1.length-1] = temp;
        return arr1;
    }
}