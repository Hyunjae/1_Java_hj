package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for(int i=1; i <= input; i++) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for(int i=input; i >=1; i--) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= input; i++) {
			sum +=i;
			if(i==input) {
				System.out.print(i + " = " + sum);
			} else {
				System.out.print(i + " + ");
			}
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
	
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1<1 || num2<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else if(num1<num2){
			for(int i = num1; i <=num2; i++) {
				System.out.print(i + " ");
			} 
		} else {
			for(int i = num2; i <=num1; i++) {
				System.out.print(i + " ");
			} 
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
	
		System.out.println("===== "+ dan + "단 =====");
		
		for(int i = 1; i<=9; i++) {
			System.out.printf("%d * %d = %d \n", dan, i, dan*i);
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		if(dan<2 || dan>9) {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		} else {
			for(int i=dan; i<=9; i++) {
				System.out.println("===== "+ i + "단 =====");
				for(int x=1; x<=9; x++) {
					System.out.printf("%d * %d = %d \n", i, x, i*x);
				}
			}
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		for(int i=1; i <= input; i++) {
			for(int x=1; x <=i; x++) {
				System.out.print("*");				
			}
			System.out.println();
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		for(int i=1; i<=input ; i++) {
			for(int x=input; x>=i; x--) {
				System.out.print("*");				
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		for(int i=1; i <= input; i++) {
			for(int x=1; x <= input-i; x++) {
				System.out.print(" ");	
			}
			for(int x=1; x <= i; x++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i=1; i<= input*2-1; i++) {
			if(i<input) {
				for(int x=1; x <= i; x++) {
					System.out.print("*");
				}
			} else {
				for(int x=input; x > i-input; x--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	
	public void practice11() {}
	
	public void practice12() {}

	public void practice13() {}
	
}
