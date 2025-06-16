//Count the number of occurrences of a specific element.
import java.util.Scanner;


public class countelement{
	public static void arr(int n, int arr[],Scanner sc){
		System.out.print("Enter the elements of arrays: ");
		for(int i = 0;i<n;i++){
			arr[i] = sc.nextInt();
			}
		}
	public static void count(int n, int arr[],int t){
		int count = 0;
		for(int i =0;i<n;i++){
			if(arr[i]==t){
				count++;
				}
			}
		System.out.print("occurence of the elements : "+count);
		}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("SIZE: ");
		int n = sc.nextInt();
		int []arr=new int[n];
		System.out.print("Traget : ");
		int t = sc.nextInt();
		arr(n,arr,sc);
		count(n,arr,t);
		}
	}