package day1;

import java.util.Scanner;

//Write a Java program to check whether a number is negative, positive or zero.

public class hw2{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to check is negative, positive or zero: ");
        int a = sc.nextInt();

        if(a < 0){
            System.out.println("This is a negative number");
        }
        else if(a > 0){
            System.out.println("This is a positive number");
        }else{
            System.out.println("This is a zero");
        }
    }
}
