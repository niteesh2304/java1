//Reverse an array.
import java.util.Scanner;

public class revarr{
	public static int rev(int n,int arr[]){
		for(int i = 0;i < n;i++){
			int first = arr[i];
			int second = arr[i+1];
			int temp = 0;
			temp = first;
			first = second;
			second = temp;
			}
		}
	public static void main(String args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the element: ");
		for(int i = 0;i < n; i++){
			arr[i] = sc.nextInt();
			}
		
		}
	}
