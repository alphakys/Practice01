package com.javaex.practice;
import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		double c;            //c는 가로
		double r;			//r은 세로
		
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.print("가로를 입력하세요: ");
		c = sc.nextDouble();
		
		
		System.out.print("세로를 입력하세요: ");
		r = sc.nextDouble();
		
		double S = r*c;  //넓이 변수S
		
		System.out.println("사각형의 넓이는 " +S);
		
		double P = (r*2)+(c*2);  //둘레 변수P
		System.out.println("사각형의 넓이는 " + P);
		
		sc.close();
		
		
	}

}
