package edu.kh.inheritance.model.vo;

public class Person extends Object { // 자식이 공통적으로 가지고 있는 필드/메서드를 작성 ( 추상화 )

	// extends Object -> 상속 구문이 작성되지 않으면
	//                   컴파일러가 자동 추가
	
	private String name;
	private int age;
	
	// 기본 생성자 : ctrl + space bar + enter
	
	public Person() { }

	// 매개변수 생성자 
	// : alt + s  또는  alt + shift s -> + o
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// 자기소개 기능
	public void introduce() {
		
		System.out.println("이름 : " + this.getName());
		System.out.println("나이 : " + this.getAge());
	}
}
