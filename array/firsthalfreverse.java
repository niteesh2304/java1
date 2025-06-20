// first half reverse
import java.util.Scanner;
public class firsthalfreverse{
	
	public static void arr(int n,int []arr,Scanner sc){
		for(int i = 0 ; i < n ; i++){
		
			arr[i] = sc.nextInt();
			}
		}
		
	public static void reverse(int n,int []arr){
		int start = 0;
		int end = ((n/2)-1);
		int temp=0;
		for(int i = 0;i<((n/2)-1);i++){
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;	
			}
		
		for(int i = 0;i<n;i++){
		System.out.print(arr[i]+" ");
			}
		}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Size : ");
		int n = sc.nextInt();
		int []arr = new int[n];
		arr(n,arr,sc);
		reverse(n,arr);
		}
	}