package com.javaex.practice;
import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		final double oneMile = 1.609;
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.print("마일을 입력하세요: ");
		double hMile = sc.nextDouble();
		
		double Km = hMile*oneMile; // 원화 --> 달러
		
		
		System.out.println(hMile+"마일은 " + Km+"킬로미터 입니다.");
		sc.close();
		
		
	}

}