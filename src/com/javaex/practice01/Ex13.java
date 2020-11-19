package com.javaex.practice01;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		final double dollar = 1230.95;
		Scanner sc= new Scanner(System.in);
		
		
		System.out.print("환전할 원화를 입력하세요: ");
		double m = sc.nextDouble();
		
		double M = m/dollar; // 원화 --> 달러
		
		
		System.out.println("받으실 달러는 " + M);
		
		
		sc.close();
	}

}
