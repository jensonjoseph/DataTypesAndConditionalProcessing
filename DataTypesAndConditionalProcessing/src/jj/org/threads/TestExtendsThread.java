package jj.org.threads;

public class TestExtendsThread {
	public static void main(String args[]) {

		ThreadDemoExtends T1 = new ThreadDemoExtends("Thread-1");
		T1.start();

		ThreadDemoExtends T2 = new ThreadDemoExtends("Thread-2");
		T2.start();
	}
}
