package com.javaex.practice01;
import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		double PI= 3.14;
		Scanner sc= new Scanner(System.in);
		
		
		System.out.print("반지름: ");
		double r = sc.nextDouble();
		
		double V = (4*PI*r*r*r)/3;
		
		System.out.println("구의 부피는: "+ V+"입니다");
		
		
		
		System.out.print("반지름: ");
			r = sc.nextDouble();
			V = (4*PI*r*r*r)/3;
		
		System.out.print("구의 부피는: "+ V+"입니다");
		
		sc.close();
	}

}