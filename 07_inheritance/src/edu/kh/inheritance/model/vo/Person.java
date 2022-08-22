package edu.kh.inheritance.model.vo;

public class Person {

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
	
	
}
