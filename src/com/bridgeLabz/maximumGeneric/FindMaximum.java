package com.bridgeLabz.maximumGeneric;

public class FindMaximum {
	public static void main(String[] args)  {
		Operations operation = new Operations();
		operation.getInputForInteger();
		int maxInt=operation.testMaximum(operation.firstNumber,operation.secondNumber,operation.thirdNumber);
		System.out.println(maxInt+" is maximum amongst integer numbers");
		operation.getInputForFloat();
		float maxFloat=operation.testMaximum(operation.number1,operation.number2,operation.number3);
		System.out.println(maxFloat+" is maximum amongst float numbers");
		operation.getInputForString();
		String maxString=operation.testMaximum(operation.string1,operation.string2,operation.string3);
		System.out.println(maxString+" is maximum amongst words");
	}
}
