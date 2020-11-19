package com.javaex.practice01;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
			
		System.out.print("월급을 입력하세요: ");
		
		int salary = sc.nextInt();
		
		// 10년은 120 개월
		// 120개월 동안 모든 월급 저축할 시 24000원
		int Maxsaving = salary*120;
	
		System.out.println("10년 동안 최대 저축액은 " + Maxsaving + "원 입니다.");
		
		sc.close();
	}

}
