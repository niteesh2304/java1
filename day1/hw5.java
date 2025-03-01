package day1;

import java.util.Scanner;
//Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.
//  Calculate percentage and grade according to following: Percentage >= 90% : Grade A Percentage >= 80% : Grade B Percentage >= 70% : Grade C
//   Percentage >= 60% : Grade D Percentage >= 40% : Grade E Percentage < 40% : Grade F-
public class hw5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Physics mark: ");
        int p = sc.nextInt();
        System.out.println("Enter the Chemistry mark: ");
        int c = sc.nextInt();
        System.out.println("Enter the Biology mark: ");
        int b = sc.nextInt();
        System.out.println("Enter the Mathematics mark: ");
        int m = sc.nextInt();
        System.out.println("Enter the Computer mark: ");
        int co = sc.nextInt();
        int total =p+c+b+m+co;
        double per = (total/500.0)*100;
        System.out.println(per);
        if(per >= 90){
            System.out.println("A");
        }else if (per <90 && per >= 80){
            System.out.println("B");
        }else if (per < 80 && per >= 70){
            System.out.println("C");
        }else if (per < 70 && per >=60){
            System.out.println("D");
        }else if (per < 60 && per <= 40){
            System.out.println("E");
        }else {
            System.out.println("F");
        }
    }
}