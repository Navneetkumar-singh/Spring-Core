package com.springpractice.springcore;

public class student {
private int rollno;
private String name;
private int age;
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
	System.out.println("bean is created");
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
	System.out.println("bean is created");
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
	System.out.println("bean is created");
}

}
