package com.javaex.practice;
import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.print("500원 개수: ");
		 	int f = sc.nextInt();
		
		System.out.print("100원 개수: ");
			int h = sc.nextInt();
		 	
		System.out.print("50원 개수: ");
			int f1 = sc.nextInt();
		 	
		System.out.print("10원 개수: ");
			int h1 = sc.nextInt();
		 	
		int A = (f*500)+(h*100)+(h1*10)+(f1*50);
		System.out.println("동전의 총합은 "+A+"원 입니다.");
		
		
		System.out.print("500원 개수: ");
	 	f = sc.nextInt();
	
	System.out.print("100원 개수: ");
		h = sc.nextInt();
	 	
	System.out.print("50원 개수: ");
		f1 = sc.nextInt();
	 	
	System.out.print("10원 개수: ");
		h1 = sc.nextInt();
	 	
		A = (f*500)+(h*100)+(h1*10)+(f1*50);
	System.out.println("동전의 총합은 "+A+"원 입니다.");
		
		
		sc.close();
		
		
	}

}