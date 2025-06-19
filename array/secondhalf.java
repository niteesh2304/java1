//sum of all second half of the elements
import java.util.Scanner;

public class secondhalf{
	
	public static void arr(int n,int []arr,Scanner sc){
		for(int i = 0; i < n ; i++){
			arr[i] = sc.nextInt(); 
			}
		}
	
	public static void second(int n,int []arr){
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = n/2; i < n ; i++){
			sum +=arr[i];
			if(arr[i] < min){
				min = arr[i];
				}
			if(arr[i]>max){
				max = arr[i];
				}
			}
		System.out.println("SECOND HALF SUM FROM ARRAYS  : "+sum);
		System.out.println("MAX =" +max);
		System.out.println("MIN =" +min);
		}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Size : ");
		int n = sc.nextInt();
		int []arr = new int[n];
		arr(n,arr,sc);
		second(n,arr);
		}
	}