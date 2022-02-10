package com.bridgeLabz.maximumGeneric;
import java.util.*;
public class Operations {
	public static Integer firstNumber,secondNumber,thirdNumber,max1;
	
	static Scanner sc = new Scanner(System.in);

	public static void getInputForInteger() {
		System.out.println("Enter first integer Number");
		firstNumber = sc.nextInt();
		System.out.println("Enter second integer Number");
		secondNumber = sc.nextInt();
		System.out.println("Enter third integer Number");
		thirdNumber = sc.nextInt();
	}
	public static Integer testMaximumInteger(Integer x,Integer y,Integer z) {
		max1 = x;
		if(y.compareTo(max1) > 0){
			max1 = y;
		}
		if(z.compareTo(max1) > 0){
			max1 = z;
		}
		return max1;
	}
}
