//remove all even indexed elements from an array

import java.util.Scanner;

public class even_index_remove{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Size: ");
		int n = sc.nextInt();
		int []nums = new int[n];
		nums(nums,sc);
		int count = count(nums);
		int []update = new int[nums.length-count];
		remove(nums,update);
		}
		
	public static void nums(int nums[],Scanner sc){
		
		for(int i = 0 ; i < nums.length ; i++){
			nums[i] = sc.nextInt();
 			}
		}
	
	public static int count(int nums[]){
		int count = 0;
		for(int i = 0 ; i < nums.length;i++){
			if(i%2==0){
				count++;
				}
			}
		return count;
		}
	
	public static void remove(int nums[],int []update){
		int j =0;
		for(int i = 0 ; i < nums.length;i++){
			if(i%2!=0){
				update[j] = nums[i];
				j++;
				}
			}
		for(int i = 0 ; i < update.length; i++){
			System.out.print(update[i]+" ");
			}
		}
	}