package edu.kh.oop.basic;

public class BasicRun {

	public static void main(String[] args) {
		
		JHJ 정현재 = new JHJ();
		// heap 영역에 JHJ 클래스에 정의된 내용을 이용하여
		// JHJ 객체 생성(할당)

		// 객체가 가지고 있는 속성
		System.out.println("이름 : " + 정현재.name);
		System.out.println("나이 : " + 정현재.age);
		System.out.println("생년월일 : " + 정현재.birthday);
		
		// System.out.println("비밀번호 : " + 정현재.password);
		// The field JHJ.password is not visible
		
		// 비밀번호를 볼 수 있는 기능을 호출 == 간접 접근 방법
		정현재.showPassword();
		
		// 기능 수행
		정현재.eat();
		정현재.study();
		정현재.plus(50, 100);
		
	
		
	}

}
