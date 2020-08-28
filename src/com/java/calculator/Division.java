package com.java.calculator;
public class Division extends Operations {
	void operation(int numbers[]) {
		float div=(float)numbers[0];
		for(int i=1; i<numbers.length; i++)
		{
			div/=(float)numbers[i];
			System.out.println(div);
		}
		System.out.println("Division : "+ div);
	}
}