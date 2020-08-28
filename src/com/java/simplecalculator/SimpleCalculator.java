package com.java.simplecalculator;
import java.util.Scanner;
public class SimpleCalculator
{
   public static void main(String args[])
   {   
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Choose the operation: \n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
        	int n = sc.nextInt();
            System.out.print("Enter the first number : ");
            int x = sc.nextInt();
            System.out.print("Enter the second number : ");
            int y = sc.nextInt();
            switch(n)
            {
                case 1:
                int add;
                add = x + y;
                System.out.println("Result : "+add);
                break;
 
                case 2:
                int sub;
                sub = x - y;
                System.out.println("Result : "+sub);
                break;
 
                case 3:
                int mul;
                mul = x * y;
                System.out.println("Result : "+mul);
                break;
 
                case 4:
                float div;
                div = (float) x / y;
                System.out.print("Result : "+div);
                break;
                
                case 5:
                System.exit(0);
            }
            sc.close();
	   		}
            
   }
