package com.bridgeLabz.maximumGeneric;
import java.util.*;
public class Operations<E> {
	public static Integer firstNumber,secondNumber,thirdNumber,maxInt;
	public static Float number1=0.0f,number2=0.0f,number3=0.0f,maxFloat=0.0f;
	public static String string1,string2,string3,maxString;


	static Scanner sc = new Scanner(System.in);

	public static void getInputForInteger() {
		System.out.println("Enter first integer Number");
		firstNumber = sc.nextInt();
		System.out.println("Enter second integer Number");
		secondNumber = sc.nextInt();
		System.out.println("Enter third integer Number");
		thirdNumber = sc.nextInt();
	}
	public static void getInputForFloat() {
		System.out.println("Enter first float Number");
		number1 = sc.nextFloat();
		System.out.println("Enter second float Number");
		number2 = sc.nextFloat();
		System.out.println("Enter third float Number");
		number3 = sc.nextFloat();
	}
	public static void getInputForString() {
		System.out.println("ENter First Word");
		string1=sc.next();
		System.out.println("ENter second Word");
		string2=sc.next();
		System.out.println("ENter third Word");
		string3=sc.next();
	}
	public static <E extends Comparable<E>> E testMaximum(E a,E b,E c) {
		E max = a;
		if(b.compareTo(max) > 0){
			max = b;
		}
		if(c.compareTo(max) > 0){
			max = c;
		}
		return max;
		}
}
