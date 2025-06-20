// read all even index number from an reversed array

import java.util.Scanner;

public class revers_even_index{
		
	public static void arr(int n, int []arr,Scanner sc){
		for(int i = 0;i<n;i++){
			arr[i] = sc.nextInt();
			}
		}
	public static void rev(int n,int []arr){
		int start = 0;
		int end = n-1;
		int temp = 0;
		for(int i = 0;i<n;i++){
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
			}
		System.out.println("reverse");
		for(int i = 0;i<n;i++){
			if(i%2==0){
				System.out.print(arr[i]+" ");
				}
			}
		}
			
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("This Size:");
		int n = sc.nextInt();
		int []arr = new int[n];
		arr(n,arr,sc);
		rev(n,arr);
		}
	}