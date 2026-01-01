import java.util.Arrays;
public class BubbleSort{
    public static void main(String args[]){
        int []a={25,26,30,23,22};

        int n = a.length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(a[i]<a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print(Arrays.toString(a));
    }
}