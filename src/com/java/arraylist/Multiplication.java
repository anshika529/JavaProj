package com.java.arraylist;
import java.util.*;

public class Multiplication extends Main
{
public void mul(ArrayList<Integer> arr)
{
for(int i=0; i < arr.size(); i++)
{
multi = multi * arr.get(i);
}
System.out.println(multi);
}
}