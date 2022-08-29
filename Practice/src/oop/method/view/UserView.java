package oop.method.view;

import java.security.Provider.Service;
import java.util.Scanner;

import oop.method.model.service.UserService;
import oop.method.model.vo.User;

public class UserView {

	private Scanner sc = new Scanner(System.in);
	
	private UserService service = new UserService();
	
	private User user = null;
	
	private User loginUser = null;
	
	public void displayMenu() {
		
		int input = 0;
		
		do {
			System.out.println("------- 사용자 기능 메뉴 --------");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 로그아웃");
			System.out.println("4. 회원 정보 출력");
			System.out.println("5. 회원 정보 수정");
			System.out.println("0. 프로그램 종료");
			System.out.println("--------------------------------");
			
			System.out.print("메뉴 선택 >> ");
			input = sc.nextInt();
			sc.nextLine();
			
			System.out.println();
			
			switch(input) {
			case 1 : signUp(); break;
			case 2 : logIn(); break;
			case 3 : logOut(); break;
			case 4 : printUser(); break;
			case 5 : break;
			case 0 : break;
			default : System.out.println("잘못 입력하셨습니다.");
			}
			
		} while(input !=0);	
	}
	
	public void signUp() {
		
		System.out.println("[회원가입]");

		System.out.print("아이디 : ");
		String id = sc.next();

		System.out.print("비밀번호 : ");
		String pw = sc.next();

		System.out.print("이름 : ");
		String name = sc.next();

		System.out.print("나이 : ");
		int age = sc.nextInt();

		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		
		user = service.signUp(id, pw, name, age, gender);
		
		System.out.println("<회원 가입 완료>");
		
	}
	
	public void logIn() {
		
		System.out.println("[로그인]");
		
		if(loginUser != null) {
			System.out.println("이미 로그인 된 상태입니다.");
		} else {
			System.out.print("아이디 : ");
			String id = sc.next();
			
			System.out.print("비밀번호 : ");
			String pw = sc.next();
			
			int result = service.login(id, pw, user);
			
			if(result == -1) {
				System.out.println("회원 가입 후 시도해주세요.");
			} else if(result == 0) {
				System.out.println("아이디 혹은 비밀번호가 일치하지 않습니다.");
			} else {
				System.out.println("<로그인 성공>");
				loginUser = user;
			}
		}
	}
	
	public void logOut() {
		System.out.println("[로그아웃]");
		
		if(loginUser != null) {
			loginUser = null;
			System.out.println("로그아웃 되었습니다.");
		} else {
			System.out.println("로그인 후 이용해주세요.");
		}
	}
	
	public void printUser() {
		System.out.println("[회원 정보 출력]");
		
		if(loginUser != null) {
			System.out.println("아이디 : " + loginUser.getUserId());
			System.out.println("비밀번호 : " + loginUser.getUserPw());
			System.out.println("나이 : " + loginUser.getUserAge() + "세");
		}
		
		String gender = null;
		if(loginUser.getUserGender() == 'M') {
			gender = "남성";
		} else {
			gender = "여성";
		}
		System.out.println("성별 : " + gender);
	}
	
	public void updateUser() {
		System.out.println("[회원 정보 수정]");
		
		if(loginUser != null) {
			System.out.print("수정할 이름 : ");
			String name = sc.next();

			System.out.print("수정할 나이 : ");
			int age = sc.nextInt();
			
			System.out.println("수정할 성별(M/F) : ");
			char gender = sc.next().charAt(0);
			
			service.updateUser(name, age, gender, loginUser);
			
			System.out.println("<정보가 수정되었습니다.>");
			
		} else {
			System.out.println("로그인 후 이용해주세요.");
		}
	}
	
}
