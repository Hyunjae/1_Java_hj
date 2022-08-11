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
		} else {
			
			// 풀이2
			if(num1 > num2) {
				// 두 변수의 값 교환
				int temp = num1; // temp : 8 / num1: 8 / num2 : 4
	
				num1 = num2; // temp : 8 / num1: 4 / num2 : 4

				num2 = temp; // temp : 8 / num1: 4 / num2 : 8
			}
			for(int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
		}	
			
			
			// 풀이1
//			int start = num1;
//			int end = num2;
//			
//			if(num1 > num2) { // 먼저 입력한 숫자가 크면 start/ end를 바꿈
//				start = num2;
//				end = num1;
//			}
//			
//			for(int i = start; i <= end; i++) {
//				System.out.print(i + " ");
//			}
		
			// 내가 푼 방식
//		} else if(num1<num2){
//			for(int i = num1; i <=num2; i++) {
//				System.out.print(i + " ");
//			} 
//		} else {
//			for(int i = num2; i <=num1; i++) {
//				System.out.print(i + " ");
//			} 
//		}
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
		int num = sc.nextInt();
		
		if(num<2 || num>9) {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		} else {
			for(int dan=num; dan<=9; dan++) {
				System.out.println("===== "+ dan + "단 =====");
				for(int i=1; i<=9; i++) {
					System.out.printf("%d * %d = %2d \n", dan, i, dan*i);
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
		
//		for(int row=1; row <= input; row++) {
//			for(int col=1; col <= input-row; col++) {
//				System.out.print(" ");	
//			}
//			for(int col=1; col <= row; col++) {
//				System.out.print("*");	
//			}
//			System.out.println();
//		}
		
		for(int row=1; row <= input; row++) {
//			// [for문을 이용한 풀이]
//			//for(int col=input-row; col>=1; col--)
//			for(int col=input-1; col >= row; col--) {
//				System.out.print(" ");	
//			}
//			for(int col=1; col <= row; col++) {
//				System.out.print("*");	
//			}
			
			// [if문을 이용한 풀이]
			for(int col = 1; col <= input; col++) { //col이 모두 input만큼 나오게 배열 후 기호를 변형
				if(col <= input - row) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}	
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
			
//		for(int i=1; i<= input*2-1; i++) {
//			if(i<input) {
//				for(int x=1; x <= i; x++) {
//					System.out.print("*");
//				}
//			} else {
//				for(int x=input; x > i-input; x--) {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		
		// 위쪽 삼각형
		for(int row=1; row<=input-1; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print("*");
			} System.out.println();
		}
		
		// 아래쪽 삼각형
//		for(int row=1; row<=input; row++) {
//			for(int col=input; col>=row; col--) {
		for(int row=input; row>=1; row--) {
			for(int col=row; col>=1; col--) {
//			for(int col=1; col<=row; col++)
				System.out.print("*");
			} System.out.println();
		}
	}
	
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row=1; row <= input; row++) {
//			for(int col=4-row; col>=1; col--) {
			for(int col=input-1; col>=row; col--) {
				System.out.print(" ");
			}
			for(int col=1; col<=2*row-1; col++) {
				System.out.print("*");
			}
			System.out.println();
		} 
//		for(int row=1; row <= input; row++) {
//			for(int col=1; col<= input*2 -1; col++) {
//				if(input-row >= col || input+row <=col) {
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
//			} System.out.println();
//		}
	}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row=1; row<=input; row++) {
			for(int col=1; col<=input; col++) {
				// 첫 번째 / 마지막 줄, 칸일 때만 * 출력
				if(row == 1 || row == input || col == 1 || col == input) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			} System.out.println();
		}

//		for(int row=1; row<=input; row++) {
//			System.out.print("*");
//		} System.out.println();
//
//		for(int row=2; row<=input-1; row++) {
//			for(int col=1; col<=1; col++) {
//				System.out.print("*");
//			}
//			for(int col=2; col<=input-1; col++) {
//				System.out.print(" ");
//			}
//			for(int col=1; col<=1; col++) {
//				System.out.print("*");
//			} System.out.println();
//		}
//		
//		for(int row=1; row<=input; row++) {
//			System.out.print("*");
//		}
	}

	public void practice13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		
		int count=0;
		
		for(int i=1; i<=input; i++) {
			// 2의 배수 또는 3의 배수인 경우 출력
			if(i%2==0 || i%3==0) {
				System.out.print(i + " ");
				
				// 2와 3의 공배수
				// 2 또는 3의 배수들 중 공배수만 if문으로 출력
				if(i%2==0 && i%3==0) {
					count++;	
				}
			}
		}
		System.out.print("\ncount : " + count);
	}
}
