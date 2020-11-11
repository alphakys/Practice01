package com.javaex.practice;
import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		
		System.out.print("상품가격: ");
		double p = sc.nextInt();  //p는 상품가격
		
		System.out.print("받은돈: ");
		double m = sc.nextInt(); //m은 받은돈
		
		System.out.println("===================");
	
		double a = p/10;   //a는 부가세 변수
		double b = m-p;   //b는 잔액 변수
		
		
		
		System.out.println("받은돈: "+m);
		System.out.println("상품가격: "+p);
		System.out.println("부가세: "+a);
		System.out.println("잔액: "+b);
	
	
		sc.close();
	
	}
	
	

}