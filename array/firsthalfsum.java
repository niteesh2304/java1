//SUM OF ALL ELEMENT FROM A FIRST HALF

import java.util.Scanner;

public class firsthalfsum{
	
	public static void arr(int n,int []arr,Scanner sc){
		for(int i = 0;i<n;i++){
			arr[i] = sc.nextInt();
			}
		}
		
	public static void halfsum(int n,int []arr){
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int half = n/2;
		int sum = 0;
		for(int i = 0;i<half;i++){
			sum += arr[i];
			if(arr[i] < min){
				min = arr[i];
				}
			if(arr[i]>max){
				max = arr[i];
				}
			}
		System.out.println("FIRST HALLF SUM : "+ sum);
		System.out.println("MAX =" +max);
		System.out.println("MIN =" +min);
		}	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("SIZE : ");
		int n = sc.nextInt();
		int []arr = new int[n];
		arr(n,arr,sc);
		halfsum(n,arr);	
		}	
	}