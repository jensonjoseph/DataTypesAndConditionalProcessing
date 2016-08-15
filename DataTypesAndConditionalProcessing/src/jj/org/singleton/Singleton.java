package jj.org.singleton;

public enum Singleton {
	INSTANCE;
	private Singleton() {
		System.out.println("In Singleton Constructor");
	}
	public void doSomething() {
		System.out.println("Doing singleton stuff");
	}
}
