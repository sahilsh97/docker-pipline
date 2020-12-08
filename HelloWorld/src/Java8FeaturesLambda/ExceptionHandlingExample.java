package Java8FeaturesLambda;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		int someNumber[] = { 1, 2, 3, 4 };
		int key = 0;

		process(someNumber, key, wrapperLambda((v, k) -> System.out.println(v / k)));
	}

	private static void process(int[] someNumber, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : someNumber) {
			consumer.accept(i, key);
		}
	}

	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		return (a, b) -> {
			try {
				consumer.accept(a, b);
			} catch (ArithmeticException e) {
				System.out.println("Exception Caught in Wrapper Lambda!");
			}

		};
	}

}
