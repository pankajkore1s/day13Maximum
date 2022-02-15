package com.bridgeLabz.maximumGeneric;
import java.util.*;
public class Operations<E extends Comparable<E>> {
	E firstValue,secondValue,thirdValue;
	public Operations(E firstValue,E secondValue,E thirdValue) {
		super();
		this.firstValue=firstValue;
		this.secondValue=secondValue;
		this.thirdValue=thirdValue;
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
	public static <E> void printMax(E a, E b, E c,E max) {
		System.err.println(max+" is max amongst the inputs");
	}
}
