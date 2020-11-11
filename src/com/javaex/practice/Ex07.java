package com.javaex.practice;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int i = 10;
		int n = ++i %2; //i = 11 따라서 n=1;
		
		System.out.println(i);  
		System.out.println(n); //6번과 7번의 차이는 나머지가 다릅니다.
							   // 6번은 i에 1이 계산 후에 더해지지만 7번은 i에 1일 먼저 더해지고 나머지 연산이 시작됩니다.	

	}

}
