package com.javaex.ex04;

//직사각형 클래스 정의
public class Rectangle extends Shape implements Resizeable {
	// 필드
	private double width;
	private double height;

	// 생성자
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// 넓이 구하는 메소드 재정의
	@Override
	public double getArea() {
		return width * height;
	}

	// 둘레 구하는 메소드 재정의
	@Override
	public double getPerimeter() {
		return 2 * (width + height);
	}

	// Resizable 인터페이스의 resize 메소드 구현
	public void resize(double s) {
		width *= s;
		height *= s;
	}
}