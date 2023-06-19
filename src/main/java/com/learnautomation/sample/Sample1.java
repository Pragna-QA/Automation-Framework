package com.learnautomation.sample;

public class Sample1 {

	public static void main(String[] args) {

		ThreadLocal<String> tl1 = new ThreadLocal<String>();

		tl1.set("Rajesh");

		ThreadLocal<String> tl2 = new ThreadLocal<String>();

		tl2.set("Pragna");

		ThreadLocal<String> tl3 = new ThreadLocal<String>();

		tl3.set("Sai");
		
		System.out.println(tl2.get());

	}

}
