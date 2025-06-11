import java.util.Scanner;

public class SplitSum{

	public static int count(int num){
		int count = 0;
		while(num!=0){
			num /= 10;
			count ++;
			}
		return count;
		}

	public static int expo(int num,int halfcount){
		int power = 1;
		for(int i = 0; i < halfcount ; i++){
			power = power * num;
			}	
		return power;
		}

	public static int rev(int num){
		int rev = 0;
		while(num!=0){
			int last = num % 10;
			rev = rev * 10 + last;
			num /= 10;
			}
		return rev;
		}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in) ;
		int num = sc.nextInt() ;
		int count = count( num ) ;
		int halfcount = count / 2 ;
		int div = expo( 10 , halfcount ) ;
		int first = num / div ;
		int last = num % div ;
		System.out.println("First Half = "+ first);
		System.out.println("Last Half = "+ last);
		System.out.println("Last Reverse = "+ rev(last)) ;
		System.out.println("Result = "+ (first+rev(last)));
		}
	}