package com.java.arraylist;

import java.util.*;

public class Main
{
static int array;
static int num;
int sum=0,subtract=0,multi=1,divide;
static String operation;
static String input;

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
ArrayList<Integer> arr = new ArrayList<Integer>();
System.out.println("Enter the quantity:");
num = sc.nextInt();
System.out.println("Enter the numbers:");
for(int i = 0; i < num; i++)
{
array = sc.nextInt();
arr.add(array);
}

System.out.println("Enter the operation you want to perform: + - * /");
operation = sc.next();

if (operation.equals("+"))
{
Addition a = new Addition();
a.add(arr);
}
else if (operation.equals("-"))
{
Subtraction s = new Subtraction();
s.sub(arr);

}
else if (operation.equals("*"))
{
Multiplication m = new Multiplication();
m.mul(arr);

}
else
{
Division d = new Division();
d.div(arr);
}
sc.close();

}

}