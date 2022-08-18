package edu.kh.oop.constructor;

import edu.kh.oop.constructor.model.vo.Member;

public class ConstructorRun {
	public static void main(String[] args) {
	
		Member member1 = new Member();
		Member member2 = new Member();
		Member member3 = new Member();
		Member member4 = new Member();
		
		Member member5 = new Member("member22", "pass22@", "010-2222-3333", 33);
		
		Member member6 = new Member("jhjjhj", "pass0101", "01099998888", 11);

		Member member7 = new Member("ididid", "pwpwpw", "01051381620", 20);
		
		System.out.println("프로그램 종료");
		
	}	
}

// -> 전달 인자, 인자(Argument)
// 기본 생성자가 없어도 Member() 구문에서 에러가 발생하지 않는다.
// -> 클래스에 생성자가 하나도 작성되지 않으면
//    컴파일러가 자동으로 기본생성자를 추가해준다.
//    public Member(){ } // Member 클래스에 자동 추가