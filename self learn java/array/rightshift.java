class rightshift {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int end = arr.length-1;
        int temp = arr[end];
        for(int i = 0 ; i < arr.length - 1; i++){
                arr[end] = arr[end-1];
                end--;
                if(end == 0){
                    arr[end] = temp;
                }
        }
        for(int i = 0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
        }
    }
}