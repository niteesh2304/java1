import java.util.Scanner;
public class dynamic_rightshift{
	
	public static void single(int []arr){
		int end = arr.length - 1; 
		int temp = end;
		for(int i = 0; i < arr.length - 1 ; i++){
			arr[end] = arr[end - 1];
			end--;
			}
		arr[end] = temp;
		}
	public static void tiwces(int []arr){
		
		int end = arr.length -1;
		int temp = end; // last
		int temp1= end-1;//last before
		for(int i = 2;i<arr.length ; i++){
			arr[end] = arr[end-2];
			end--;
			}
		arr[end] = temp1;
		arr[end-1] = temp;
		}
	public static void arr(int arr[]){
		
		for(int i = 0 ; i < arr.length-1; i++){
			System.out.print(arr[i]+" ");
			}	
		}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int []arr = {3,1,2};
		System.out.println("Enter the number of right shit: ");
		int x = sc.nextInt();
		if(x == 1){
			single(arr);
			arr(arr);
			}else{
			tiwces(arr);
			arr(arr);
			}
		}
	}