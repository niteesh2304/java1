//remove all occurrences of an element from array

import java.util.Scanner;

public class remove_element{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Size: ");
		int n = sc.nextInt();
		int []original = new int[n];
		arr(original,sc);
		System.out.println("target = ");
		int target = sc.nextInt();
		int count = count(original,target);
		int []update = new int[original.length-count];
		remove(update,target,original);
		}
	public static void arr(int []original,Scanner sc){
		for(int i = 0 ; i < original.length ; i++ ){
			original[i] = sc.nextInt();
			}
		}
	public static int count(int []original,int target){
		int count = 0;
		for(int i = 0 ; i < original.length;i++){
			if(original[i]==target){
				count++;
				}
			}
		return count;
		}
	public static void remove(int []update,int target,int []original){
		int j =0;
		for(int i =0;i<original.length;i++){
			if(original[i]!=target){
				update[j] = original[i];
				j++;
				}
			}
		System.out.print("[");
		for(int i = 0 ; i<update.length;i++){
			System.out.print(update[i]+" ");
			}
		System.out.print("]");
		}
	}