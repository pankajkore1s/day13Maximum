package com.bridgeLabz.maximumGeneric;

public class FindMaximum {
	public static void main(String[] args)  {
		Operations operation = new Operations();
		operation.getInputForInteger();
		operation.testMaximumInteger(operation.firstNumber,operation.secondNumber,operation.thirdNumber);
		System.out.println(operation.max1+" is maximum amongst integer numbers");
	}
}
