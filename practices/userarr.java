import java.util.Scanner;

public class userarr{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array = ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the "+ n+" integers =");
		
		for(int i = 0 ;i < n;i++){
			arr[i] = sc.nextInt();
			}
		for(int i = 0; i < n ; i++){
			System.out.print(arr[i]+" ");}
	}	
}