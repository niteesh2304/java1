//Replace indexes element with the new element from another array
import java.util.Scanner;
	 
public class replace_element{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("replace index : ");
		int index = sc.nextInt();
		int original[] = {10,20,30,40};
		int update[] = {1,2,3,4};
		for(int i = 0 ; i < original.length ; i++){
			if(index >=0 && index < original.length && index < update.length){
				original[index] = update[index];
				}
			else{
				System.out.println("Invalid index");
				}
			}
		for(int i = 0 ; i<original.length;i++){
			System.out.print(original[i]+" ");	
			}
		}	
	}