//find the sum of all given elements from an int array?
import java.util.Scanner;

public class SumElements
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of an array : ");
		int n = sc.nextInt();
		int sum = 0;
		int []arr = new int[n];
		for(int i=0;i<n;i++){
			System.out.printf("Enter %d value in array: ",i);
			arr[i] = sc.nextInt(); 
			}
		for(int i =0;i<n;i++){
			sum+=arr[i];
			}
		System.out.println("sum :"+sum);
		}

	}