// swap two given index
import java.util.Scanner;
		
public class swap{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,5};
		int i = sc.nextInt();
		int j = sc.nextInt();
		int start = i;
		int end = j;
		int temp =0;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		for(int k = 0 ; k < arr.length;k++){
			System.out.println(arr[k]);
			}
		}	
	}