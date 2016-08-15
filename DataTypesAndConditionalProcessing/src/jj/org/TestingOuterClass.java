package jj.org;

import jj.org.HelloWorldDriver.InnerClass;

public class TestingOuterClass {

	public static void main(String[] args) {
		OuterClass o = new OuterClass();// outer class is directly accessible
		HelloWorldDriver hw = new HelloWorldDriver();
		InnerClass in = hw.new InnerClass();// To access the Inner class , a
											// reference to its parent is
											// mandatory

	}

}
