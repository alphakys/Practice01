package com.javaex.practice;
import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.print("화씨: ");
		double F = sc.nextDouble();   //F는 화씨 변수
		
		double C = ((F-32)*5)/9;
		
		System.out.println("화씨 "+ F + "의 섭씨온도는 "+ C +"입니다");
		
		
		
		System.out.print("화씨: ");
		 	F = sc.nextDouble();   //F는 화씨 변수
		
		 	C = ((F-32)*5)/9;
		
		System.out.println("화씨 "+ F + "의 섭씨온도는 "+ C +"입니다");
		
		sc.close();
	}

}