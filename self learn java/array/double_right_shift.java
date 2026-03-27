public class double_right_shift{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int end = arr.length-1;
        int temp = arr[end];
        int temp1 = arr[arr.length-2];
        for(int i = 2 ; i < arr.length; i++){
                arr[end] = arr[end-2];
                end--;
        }
        arr[end] = temp1;
        arr[end-1]= temp;
        
        for(int i = 0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
        }
    }
}