package Java8FeaturesLambda;

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		MyLambda exp = () -> System.out.println("Hello!");
		exp.fun();
	}

	@FunctionalInterface
	//This annotation forces the interface to have only one abstract method.
	interface MyLambda {
		void fun();
	}
}
