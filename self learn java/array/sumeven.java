// sum of all even number in a array and all odd
//max and min

import java.util.Scanner;

public class sumeven{
	public static void arr(int n,int []arr,Scanner sc){
		for(int i = 0;i<n;i++){
			arr[i] = sc.nextInt();
			}
		}
	
	public static void even(int n,int []arr){
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i<n;i++){
			if(arr[i]%2==0){
				sum += arr[i];
				if(arr[i] < min){
					min = arr[i];
					}
				}
			}
		System.out.println("Sum of even : "+ sum);
		System.out.println("MIN OF EVEN : "+min);	
		}
	
	public static void odd(int n,int []arr){
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 0; i<n;i++){
			if(arr[i]%2==1){
				sum += arr[i];
				if(arr[i] > max){
					max = arr[i];
					}
				}
			}
		System.out.println("Sum of odd : "+ sum);
		System.out.println("MAX OF ODD: "+max);	
		
		}
	public static void main(String args[]){
		Scanner sc =  new Scanner(System.in);

		System.out.println("Size: ");
		int n = sc.nextInt();
		int []arr = new int[n]; 	
		arr(n,arr,sc);
		even(n,arr);
		odd(n,arr);
		}		
	}