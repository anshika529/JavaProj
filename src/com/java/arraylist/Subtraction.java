package com.java.arraylist;
import java.util.*;

public class Subtraction extends Main
{
public void sub(ArrayList<Integer> arr)
{
subtract= arr.get(0);

for(int i = 0; i < arr.size()-1; i++)
{
subtract =subtract - arr.get(i+1);
}
System.out.println(subtract);
}

}
