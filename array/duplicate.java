//remove duplicate

import java.util.Scanner;

public class duplicate{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Size ");
		int n = sc.nextInt();
		int []original = new int[n];
		original(original,sc);
		int count = count(original);
		int []update = new int[original.length-count]; 
		duplicate(original,update,count);
		}
	public static void original(int original[],Scanner sc){
		for(int i = 0 ; i < original.length; i++){
			original[i] = sc.nextInt();
			}
		}
	public static int count(int original[]){
		int count = 0;
		for(int i = 0 ; i < original.length;i++){
			for(int j = i+1 ; j < original.length;j++){
				if(original[i] == original[j]){
					count++;
					}
				}
			}
		return count;
		}
	public static void duplicate(int []original,int update[],int count){
		int x = 0;
		for(int i = 0;i < original.length;i++){
			boolean isDuplicate = false;
			for(int j = i+1;j<original.length;j++){
				if(original[i] == original[j])
					isDuplicate = true;
				}
			if(!isDuplicate){
				update[x] = original[i];
				x++;
				}
			}
		for(int i = 0;i< update.length;i++){
			System.out.print(update[i]+" ");
			}
		}
	}