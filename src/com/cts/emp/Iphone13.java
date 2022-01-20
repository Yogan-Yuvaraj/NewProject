package com.cts.emp;

public class Iphone13 extends Iphone12 {
	@Override
	public void camera() {
		System.out.println("40 MP");
	}
	@Override
	public void screenSize() {
		System.out.println("8 Inches");
			}
	public static void main(String[] args) {
		Iphone13 i = new Iphone13();
		i.softwares();
		i.camera();
		i.screenSize();
	}

}
