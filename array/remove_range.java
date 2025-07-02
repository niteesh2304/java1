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
		}
	public static void arr(int nums[],sc Scanner){
		System.out.print("nums = ")
		for(int i =0 ; i < nums.arr.length;i++){
			num[i] = sc.nextInt();
			}
		System.out.println();
		}
	public static int count(int nums[],int low,int high){
		count = 0;
		for(int i = 0 ; i < nums.length-1;i++){
			if(arr[i] > low && arr[i] < high){
				count++;
				}
			}
		}
	public static void remove(int nums[],int low,int high){
		int j = 0;
		for(int i = 0 ; i < nums.length-1;i++){
			}
		}
	}