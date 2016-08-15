package jj.org.threads;

public class V_1_2_TestRunnableThread {
	public static void main(String args[]) {

		V_1_1_RunnableDemo R1 = new V_1_1_RunnableDemo("Thread-1");
		R1.start();

		V_1_1_RunnableDemo R2 = new V_1_1_RunnableDemo("Thread-2");
		R2.start();
	}
}
