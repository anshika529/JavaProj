package com.java.updatedcalc;
public class Addition extends Operations{
	void operation(int numbers[]) {
		int sum=numbers[0];
		for(int i=1; i<numbers.length; i++)
		{
			sum+=numbers[i];
		}
		System.out.println("Addition : "+ sum);
	}
}
