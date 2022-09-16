package com.yermi.testlib.entity;

public class TestLib {
	private String text = "예르미의 코딩노트";
	private int year = 2022;
	
	public void helloWorld() {
		System.out.println("Hello World!");
	}

	public TestLib() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TestLib(String text, int year) {
		super();
		this.text = text;
		this.year = year;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return String.format("TestLib [text=%s, year=%s]", text, year);
	}
}
