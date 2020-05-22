package com.javaex.ex01;

public abstract class Shape {

	protected String fillColor;

	// 생성자
	public Shape() {

	}

	public Shape(String fillColor) {
		this.fillColor = fillColor;
	}

	// g/s
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	// 메소드
	public abstract void draw();

}
