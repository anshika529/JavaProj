package com.java.arraylist;
import java.util.*;

public class Addition extends Main
{
public void add(ArrayList<Integer> arr)
{
for(int i=0; i < arr.size(); i++)
{

sum = sum + arr.get(i);
}
System.out.println(sum);
}

}