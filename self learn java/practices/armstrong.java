import java.util.Scanner;

public class armstrong{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int temp1 = n;
		int count = 0;
		
		while(temp != 0){
			temp/=10;
			count++;}
		
		
		int arm = 0;
		while(n!=0){
			int expo = 1;
			int last = n % 10;
			for(int i = 0;i<count;i++){
				expo = expo * last;
				}
			arm += expo;
			n/=10;}
		if(arm == temp1){
		System.out.println("this is an armstrong number "+arm);
			}else{
			System.out.println("this is not an armstrong number");}
		

		
		}
	}