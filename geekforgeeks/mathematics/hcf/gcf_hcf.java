import java.util.Scanner;

public class gcf_hcf{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b	 = sc.nextInt();
		int gcd = 0;

		// first method -1

		// int min = Integer.MAX_VALUE;
		// if(a>b){
		// 	min = a ;	
		// }else{
		// 	min = b;
		// 	}


		// second method -2

		int min = Math.min(a,b);

		while(min>0){
			if(a%min==0 && b%min==0){
				gcd = min;										//Time complexity		
				break;											// O(min(a,b))
			}else{
				min--;
			}
		}
		System.out.println(gcd);
	}	
}