//remove range of elements from array;

import java.util.Scanner;

public class remove_range{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Size :");
		int n = sc.nextInt();
		int []nums = new int[n];
		System.out.println("low = ");
		int low = sc.nextInt();
		System.out.println("high = ");
		int high = sc.nextInt();
		arr(nums,sc);
		int count = count(nums,low,high);
		int []update = new int[nums.length-count];
		remove(nums,update,low,high);
		}
	public static void arr(int nums[],Scanner sc){
		System.out.print("nums = ");
		for(int i =0 ; i < nums.length;i++){
			nums[i] = sc.nextInt();
			}
		System.out.println();
		}
	public static int count(int nums[],int low,int high){
		int count = 0;
		for(int i = 0 ; i < nums.length;i++){
			if(nums[i] > low && nums[i] < high){
				count++;
				}
			}
		return count;
		}
	public static void remove(int nums[],int update[],int low,int high){
		int j = 0;
		for(int i = 0 ; i < nums.length;i++){
			if(low > nums[i] || high < nums[i]){
				update[j] = nums[i];
				j++; 
				}
		}
		for(int i = 0 ; i < update.length;i++){
			System.out.print(update[i]+" ");	
			}
		}
	}