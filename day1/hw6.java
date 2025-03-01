package day1;

import java.util.Scanner;

// Write a Java program to input basic salary of an employee and calculate its Gross salary 
// according to following: Basic Salary <= 10000 : HRA = 20%, DA = 80% Basic Salary <= 20000 : HRA = 25%,
//  DA = 90% Basic Salary > 20000 : HRA = 30%, DA = 95%

public class hw6{
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    int basic_Salary = sc.nextInt();
    double gross_salary;

    if (basic_Salary<=10000){
        gross_salary = basic_Salary + basic_Salary * 0.2 + basic_Salary * 0.8;
        System.out.println("Gross salary "+gross_salary);
    }else if(basic_Salary<=20000){
        gross_salary = basic_Salary + basic_Salary * 0.25 + basic_Salary * 0.9;
        System.out.println("Gross salary "+gross_salary); 
    }else if(basic_Salary > 20000){
        gross_salary = basic_Salary + basic_Salary*0.3 + basic_Salary*0.95;
        System.out.println("Gross salary "+gross_salary);
    }else{
        System.out.println("null");
    }
}
    
}