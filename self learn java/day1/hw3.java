package day1;

import java.util.Scanner;

// Write a Java program to check whether a number is divisible by 5 and 11 or not
public class hw3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente the value: ");
        int a = sc.nextInt();
        if(a % 5 == 0 && a % 11 == 0){
            System.out.println("Its is divisible by 5 and 11");
        }else{
            System.out.println("This number not divisible by 5 and 11");
        }
    }
}