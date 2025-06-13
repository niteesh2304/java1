// Count even and odd numbers in an array
import java.util.Scanner;

public class oddevenjava{
	public static void arr(int n,int []arr,Scanner sc){
		for(int i = 0 ; i < n ; i++){
			arr[i] = sc.nextInt();
			}
		}
	public static void output(int n, int[] arr){
		
		for(int i = 0 ; i < n ; i++){
			System.out.print(arr[i]+" ");
			}
		System.out.println();
		}
	public static void odd(int n,int[] arr){
		int odd = 0;
		int even = 0;
		System.out.println("EVEN :");
		for(int i = 0;i<n;i++){
			if(arr[i]%2==0){
				System.out.print(arr[i]+" ");
				even +=1;
			}
		}
		System.out.println();
		System.out.println("ODD: ");
		for(int i = 0 ; i< n ; i++){
			if(arr[i]%2==1){
				System.out.print(arr[i]+" ");
				odd +=1;
				}
			}
		System.out.println(even);
		System.out.println(odd);
		System.out.println();
		}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		arr(n,arr,sc);
		output(n,arr);
		odd(n,arr);
		
		}
	}