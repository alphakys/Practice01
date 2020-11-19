package com.javaex.practice01;

public class Ex03 {
	public static void main(String[] args) {
		
		int x = 1;
		int y = 1;
		
		int a = ++x *2;
		int b = y++ *2;
		
		System.out.println("a=" + a);  // x=2 a=4
		System.out.println("b=" + b);  // b=2 y=1
		System.out.println("x=" + x);  // y=2 x=2
		System.out.println("y=" + y);  // x=2 y=2

		
	}
}
