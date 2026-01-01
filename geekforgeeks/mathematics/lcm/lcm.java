import java.util.Scanner;

public class lcm{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int dividend = Math.max(a,b);
		result(a,b,dividend);
		}
	public static void result(int a,int b,int dividend){
		while(true){
			if(dividend % a ==0 && dividend % b==0){
				break;
				}
			else{					//----->Time complexity = O(a*b-max(a,b))<-----
				dividend++;
				}
			}
		System.out.println(dividend);
	}
	}