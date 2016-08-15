package jj.org2;

import jj.org.*;

public class TestingOuterInNewPackage {
	int abc = 5;

	public static void main(String[] args) {
		Entry e = new Entry();
		e.testInterfaceMethod();

		TestAbstract abs = new TestAbstract();
		abs.abc = 100;
		abs.atestAbstractMethod();
	}

}

class Entry implements TestInterface {

	@Override
	public void testInterfaceMethod() {
		System.out.println("Interface value of ABC : " + abc);
		// abc = 15;
	}

}

abstract class MyAbstractClass {

	int abc = 5;

	abstract void atestAbstractMethod();

}

class TestAbstract extends MyAbstractClass {

	@Override
	void atestAbstractMethod() {
		System.out.println("Value of abc in test abstract : " + abc);

	}

}
