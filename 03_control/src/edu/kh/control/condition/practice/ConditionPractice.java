package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		
		String result;
		if(input < 0) {
			result = "양수만 입력해주세요.";
		} else if (input % 2 == 0) {
			result = "짝수입니다.";
		} else {
			result = "홀수입니다.";
		}
		
		System.out.println(result);
		
//		if(input > 0) {
//			if(input % 2 ==0) {
//				System.out.println("짝수 입니다.");
//			} else {
//				System.out.println("홀수 입니다.");
//			}
//		} else {
//			System.out.println("양수만 입력해주세요.");
//		}
		
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = sum / 3.0;
		
		if(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
		
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int input = sc.nextInt();
		
		int result;
		switch(input) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: result = 31; break;
		case 4: case 6: case 9: case 11: result = 30; break;
		case 2: result = 28; break;
		default: result = -1;
		}
		if(result == -1) {
			System.out.println(input + "월은 잘못 입력된 달입니다.");
		} else {
			System.out.println(input + "월은 " + result + "일까지 있습니다.");
		}
		
//		switch(input) {
//		case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
//			System.out.println(input + "월은 31일 까지 있습니다.");
//			break;
//		case 4: case 6: case 9: case 11: 
//			System.out.println(input + "월은 30일 까지 있습니다.");
//			break;
//		case 2: 
//			System.out.println(input + "월은 28일 까지 있습니다.");
//			break;
//		default: System.out.println(input + "월은 잘못 입력된 달입니다.");;
//		}
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();

		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		String result;
		if(bmi < 18.5) {
			result = "저체중";
		} else if (bmi < 23) {
			result = "정상체중";
		} else if (bmi < 25) {
			result = "과체중";
		} else if (bmi < 30) {
			result = "비만";
		} else {
			result = "고도 비만";
		}
		
		System.out.println("BMI 지수 : " + bmi);
		System.out.println(result);
	
	}
	
	public void practice5() {
		
		/* 참고사항
		 * 1. double형으로 변환 따로 작성하지 않아도 scanner 입력구간에서 형변환 가능
		 * 2. 비율을 바꿔줄 때 새로 변수를 생성하지 않고 *= 연산자로 짧게 변경 가능
		 * 3. 결과를 printf로 형태를 정해주고 출석만 double에서 int로 강제 형변환
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		double midScore = sc.nextInt();  // int로 입력받아도 대입 연산 시 double로 자동 형변환
		System.out.print("기말 고사 점수 : ");
		double finalScore = sc.nextInt();
		System.out.print("과제 점수 : ");
		double homeWork = sc.nextInt();
		System.out.print("출석 횟수 : ");
		double attendance = sc.nextInt();
		
		// 각각의 점수를 비율에 맞게 변경(*= 연산자 사용)
		midScore *= 0.2;
		finalScore *= 0.3;
		homeWork *= 0.3;
		// attendance *= 5 * 0.2; => 1
		double totalScore = midScore + finalScore + homeWork + attendance;
		
		System.out.println("============= 결과 =============");
		if(attendance <= 14) {
			System.out.printf("Fail [출석 횟수 부족 (" + (int)attendance+ "/20)]");
													// 소수점 버림처리
		} else {
			System.out.printf("중간 고사 점수(20) : %.1f\n" + midScore);
			System.out.printf("기말 고사 점수(30) : %.1f\n" + finalScore);
			System.out.printf("과제 점수    (30) : %.1f\n" + homeWork);
			System.out.printf("출석 횟수    (20) : %.1f\n" + attendance);
			System.out.printf("총점 : %.1f\n" + totalScore);
			
			if(totalScore < 70) {
				System.out.println("Fail [점수 미달]");
			} else {
				System.out.println("Pass");
			}
		}
	}
}
