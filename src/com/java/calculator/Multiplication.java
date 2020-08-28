package com.java.calculator;

public class Multiplication extends Operations {
	void operation(int numbers[]) {
		int mul=numbers[0];
		for(int i=1; i<numbers.length; i++)
		{
			mul*=numbers[i];
		}
		System.out.println("Product : "+ mul);
	}
}


