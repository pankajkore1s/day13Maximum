package com.bridgeLabz.maximumGeneric;

public class FindMaximum {
	public static void main(String[] args)  {
		Integer firstNumber=11,secondNumber=29,thirdNumber=175;
		Float number1=9.20f,number2=11.02f,number3=3.10f;
		String string1="Apple",string2="Peach",string3="Banana";
		
		Operations operation =new Operations(firstNumber,secondNumber,thirdNumber);
		int MaxInt=operation.testMaximum(firstNumber,secondNumber,thirdNumber);
		Operations.printMax(firstNumber,secondNumber,thirdNumber,MaxInt);
		
		Operations operation1=new Operations(number1,number2,number3);
		float MaxFloat=operation1.testMaximum(number1,number2,number3);
		Operations.printMax(number1,number2,number3,MaxFloat);
		
		Operations operation2=new Operations(string1,string2,string3);
		String MaxString=operation2.testMaximum(string1,string2,string3);
		Operations.printMax(string1,string2,string3,MaxString);
		
	}
}
