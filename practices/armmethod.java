import java.util.Scanner;

public class armmethod{
	public static int count(int num){
		int count = 0;
		while(num>0){
			num /= 10;
			count++ ;
			}
		return count;
		}
	public static int power(int num,int count){
		int power = 1;
		for(int i = 0;i<count;i++){
			power *= num;
			}
		return power;
		
		} 
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();	
		int count = count(num);
		int temp = num;
		int arm = 0;
		while(num > 0){
			int last = 0;
			last = num % 10;
			
			arm = arm + power(last,count);
			num /=10;
			}
		if(arm == temp){
			System.out.println("It's an amrstrong number "+arm);
			}else{
				System.out.println("It's not an armstrong number "+arm);
				}
		}	
	}