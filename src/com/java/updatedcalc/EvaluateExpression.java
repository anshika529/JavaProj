package com.java.updatedcalc;
public class EvaluateExpression {
	 double result;
	 void evaluateexp(String s) {
		 String mainexpression[]=s.split(" ");
		 result=Double.parseDouble(mainexpression[0]);
		 for(int i=1;i<mainexpression.length;i=i+2) {
			 if(mainexpression[i].equals("+")) {
				 result=result+Double.parseDouble(mainexpression[i+1]);
			 }else if(mainexpression[i].equals("-")) {
				 result=result-Double.parseDouble(mainexpression[i+1]);
			 }else if(mainexpression[i].contentEquals("*")) {
				 result=result*Double.parseDouble(mainexpression[i+1]);
			 }
			 else if(mainexpression[i].equals("/")) {
				 result=result/Double.parseDouble(mainexpression[i+1]);
			 }
		 }
		 System.out.println(result);
	 }
	}