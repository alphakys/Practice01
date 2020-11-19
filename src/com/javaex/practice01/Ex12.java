package com.javaex.practice01;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14;
		double r; //반지름 r
		
		
		Scanner sc = new Scanner(System.in);
				
		
		
		System.out.print("반지름을 입력하세요: ");
		
		r = sc.nextInt();
		
		System.out.println("원의 넓이는 " + PI*r*r);
		
		sc.close();
		
		
	}

}
