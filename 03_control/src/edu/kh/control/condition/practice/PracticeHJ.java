package edu.kh.control.condition.practice;

import java.util.Scanner;

public class PracticeHJ {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		double midTerm = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		double finalTerm = sc.nextInt();		
		System.out.print("과제 점수 : ");
		double homeWork = sc.nextInt();
		System.out.print("출석 횟수 : ");
		double attendance = sc.nextInt();
		
		midTerm *= 0.2;
		finalTerm *= 0.3;
		homeWork *= 0.3;
		attendance *= 5 * 0.2;
		
		double totalScore = midTerm + finalTerm + homeWork + attendance;
		
		if(attendance <= 14) {
			System.out.println("========= 결과 =========");
			System.out.println("Fail [출석 횟수 부족 ("+ (int)attendance + "/20)]");
		} else {
			System.out.println("중간 고사 점수(20) : " + midTerm);
			System.out.println("기말 고사 점수(30) : " + finalTerm);
			System.out.println("과제 점수(30) : " + homeWork);
			System.out.println("출석 점수(20) : " + attendance);
			System.out.println("총점 : " + totalScore);
			if(totalScore <= 70) {
				System.out.println("Fail [점수 미달]");
			} else {
				System.out.println("PASS");
			}
		}
		
	
	}
}
