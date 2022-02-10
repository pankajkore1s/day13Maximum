package com.bridgeLabz.maximumGeneric;

public class FindMaximum {
	public static void main(String[] args)  {
		Operations operation = new Operations();
		operation.getInputForInteger();
		operation.testMaximumInteger(operation.firstNumber,operation.secondNumber,operation.thirdNumber);
		System.out.println(operation.maxInt+" is maximum amongst integer numbers");
		operation.getInputForFloat();
		operation.testMaximumFloat(operation.number1,operation.number2,operation.number3);
		System.out.println(operation.maxFloat+" is maximum amongst float numbers");
		operation.getInputForString();
		operation.testMaximumString(operation.string1,operation.string2,operation.string3);
		System.out.println(operation.maxString+" is maximum amongst words");
	}
}
