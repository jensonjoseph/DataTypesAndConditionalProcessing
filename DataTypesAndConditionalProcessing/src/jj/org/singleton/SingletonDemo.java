package jj.org.singleton;

public class SingletonDemo {
	public static void main(String[] args) {
		Singleton.INSTANCE.doSomething();
		Singleton.INSTANCE.doSomething();
		Singleton.INSTANCE.doSomething();

	}

}
