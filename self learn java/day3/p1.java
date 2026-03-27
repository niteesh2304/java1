package day3;
// 4x4 square pattern 
public class p1 {
    public static void main(String args[]){
        int num = 4;
        for(int o = 1 ; o <= num ; o++){
            for(int i = 1 ; i <= num ; i++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
