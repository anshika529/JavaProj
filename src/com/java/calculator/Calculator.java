package com.java.calculator;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Operations obj;
		Scanner sc = new Scanner(System.in);
		int numbers[]= {0};  //default initialization
		int op,ex;
		do 
		{
		System.out.println("Choose the operation from the menu: \n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Evaluate expression \n6. Exit");
		op = sc.nextInt();
		if(op!=6)
		{
			if(op!=5) {
		System.out.println("Enter number of values: ");
		int val=sc.nextInt();
		numbers=new int[val];
		
		for(int i=0; i<val; i++)
		{
			System.out.println("Enter value: ");
			numbers[i]=sc.nextInt();
		}
			}
		System.out.println("Enter the Expression: ");
		if(op == 1)
		{
			obj = new Addition();
			obj.operation(numbers);
		}
		else if(op == 2)
		{
			obj = new Subtraction();
			obj.operation(numbers);
		}
		else if(op == 3)
		{
			obj = new Multiplication();
			obj.operation(numbers);
		}
		else if(op == 4)
		{
			obj = new Division();
			obj.operation(numbers);
		}
		else if(op==5) {
			sc.nextLine();
			String s=sc.nextLine();
			EvaluateExpression ep=new EvaluateExpression();
			ep.evaluateexp(s);
		}
		else
		{
			System.out.println("Invalid Operation");
		}
		}
		System.out.println("Do you want to continue? 1.Yes 2.No");
		ex=sc.nextInt();
		}while(ex==1);
		sc.close();
	}

}