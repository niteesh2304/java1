import java.util.Scanner;

public class trailing_zeros{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
    //     int n = sc.nextInt();
    //     int fact = 1;
    //     for(int i = 1; i <=n ; i++){
    //         fact*=i;
    //     }
    //     int count = 0;

    //     while(fact!=0){
    //         int last_number = 0;
    //         last_number = fact%10;
    //         fact/=10;
    //         if(last_number==0){
    //             count++;
    //         }else{
    //             break;
    //         }
        
    //     }
    //     System.out.println(count);
    // 


    //every 5 times there is an zero is there in the trailing zero factorial numbers 
    int n = sc.nextInt();

    int res = 0;

    for(int i = 5 ; i <= n ; i=i*5){
        res = res + (n/i);
    }
            System.out.print(res);
    }
}