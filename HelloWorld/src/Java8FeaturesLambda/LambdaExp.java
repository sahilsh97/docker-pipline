package Java8FeaturesLambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExp {
	public static void main(String[] args) {
		printingListUsingLambdaExp();

		// Lambda as interface type
		// Implementing the function of an interface.
		MyLambda exp = () -> System.out.println("Hello!");
		exp.fun();
	}

	private static void printingListUsingLambdaExp() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(1);
		// Lambda Expression to print all the numbers.
		Consumer<Integer> method = (n) -> {
			System.out.println(n);
			
		};
		numbers.forEach(method);
	}

}

//interface is optional, if you already have an interface then just add the method with the same signature.
interface MyLambda {
	void fun();
}
