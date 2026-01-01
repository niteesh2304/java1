import java.util.Arrays;

public class SelectionSort{
    public static void main(String args[]){
        int g[] = {8,17,16,2,1,3,-2};
        
        for(int i=0;i<g.length-1;i++){
            int s = i;
            for(int j=i+1;j<g.length;j++){
                if(g[s]>g[j]){
                    s=j;
                }
            }
            int temp = g[i];
                g[i]=g[s];
                g[s]=temp;
        }
        System.out.print(Arrays.toString(g));
    }
}