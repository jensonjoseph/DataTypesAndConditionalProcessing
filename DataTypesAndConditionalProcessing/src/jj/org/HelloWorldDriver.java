package jj.org;



public class HelloWorldDriver {
	public static void main(String[] args) {
		System.out.println("Hello World");

		OuterClass o = new OuterClass();

	}

	 class InnerClass {
		public InnerClass() {
			System.out.println("Instantiating InnerClass");
		}

	}
}

class OuterClass {
	public OuterClass() {
		System.out.println("Instantiating OuterClass object");
	}
}
