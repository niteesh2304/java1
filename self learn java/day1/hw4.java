package day1;

import java.util.Scanner;
//Write a Java program to calculate profit or loss.

public class hw4{
    public static void main(String  args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the buy value of the product: ");
        int a = sc.nextInt();
        System.out.println("Enter the sell value of the product: ");
        int b = sc.nextInt();
        if (a<b){
            System.out.println("Profit");
        }else{
            System.out.println("Loss");
        }
    }
}