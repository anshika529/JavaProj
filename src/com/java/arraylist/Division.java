package com.java.arraylist;
import java.util.*;
public class Division extends Main
{
public void div(ArrayList<Integer> arr)
{

divide = arr.get(0);

for(int i=0; i < arr.size()-1; i++)
{

divide = divide / arr.get(i+1);
}
System.out.println(divide);
}
}