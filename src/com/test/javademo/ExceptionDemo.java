package com.test.javademo;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
