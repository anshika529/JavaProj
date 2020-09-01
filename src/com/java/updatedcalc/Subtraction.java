package com.java.updatedcalc;


public class Subtraction extends Operations {
	void operation(int numbers[]) {
		int sub=numbers[0];
		for(int i=1; i<numbers.length; i++)
		{
			sub-=numbers[i];
		}
		System.out.println("Subtraction : "+ sub);
	}
}
