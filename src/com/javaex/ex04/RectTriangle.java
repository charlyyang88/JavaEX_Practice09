package com.javaex.ex04;

public class RectTriangle extends Shape{
	// 필드
    private double width;
    private double height;
    
    // 생성자
    public RectTriangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    // 넓이 구하는 메소드 재정의
    public double getArea() {
        return width * height / 2;
    }
    
    // 둘레 구하는 메소드 재정의
    public double getPerimeter() {
        return width + height + Math.sqrt(width * width + height * height);
    }
}