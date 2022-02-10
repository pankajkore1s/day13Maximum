package com.bridgeLabz.maximumGeneric;
import java.util.*;
public class Operations {
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
		number1 = sc.nextFloat();
	}
	public static void getInputForString() {
		System.out.println("ENter First Word");
		string1=sc.next();
		System.out.println("ENter second Word");
		string2=sc.next();
		System.out.println("ENter third Word");
		string3=sc.next();
	}
	public static Integer testMaximumInteger(Integer x,Integer y,Integer z) {
		maxInt = x;
		if(y.compareTo(maxInt) > 0){
			maxInt = y;
		}
		if(z.compareTo(maxInt) > 0){
			maxInt = z;
		}
		return maxInt;
	}
	public static Float testMaximumFloat(Float a,Float b,Float c) {
		maxFloat = a;
		if(b.compareTo(maxFloat) > 0){
			maxFloat = b;
		}
		if(c.compareTo(maxFloat) > 0){
			maxFloat = c;
		}
		return maxFloat;
	}
	public static String testMaximumString(String p,String q,String r) {
		maxString=p;
		if(q.compareTo(maxString)>0) {
			maxString=q;
		}
		if(r.compareTo(maxString)>0) {
			maxString=r;
		}
		return maxString;
	}

}
