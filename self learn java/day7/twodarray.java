import java.util.Arrays;
import java.util.Scanner;
public class twodarray{
	public static void print(int row,int column,int arr[][]){
		for(int i = 0;i<row;i++){
			for(int j=0;j<column;j++){
				System.out.println(arr[i][j]);
				}
			}
		}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int column = sc.nextInt(); 
		int arr[][] = new int [row][column];
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				arr[i][j] = sc.nextInt();
					}
			}
		print(row, column, arr);
		System.out.println(Arrays.deepToString(arr));
		}
	}