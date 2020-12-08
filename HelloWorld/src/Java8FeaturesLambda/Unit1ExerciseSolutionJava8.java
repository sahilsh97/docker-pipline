package Java8FeaturesLambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExerciseSolutionJava8 {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("charles", "Dickens", 60), new Person("ramu", "balu", 20),
				new Person("vishnu", "bhai", 66), new Person("gobind", "bhadwa", 40),
				new Person("mamesh", "chingu", 50));

		// step 1:sort the list by lastname
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareToIgnoreCase(p2.getLastName()));

		/*
		 * //sort by age Collections.sort(people, (a, b) -> { return
		 * Integer.compare(a.getAge(), b.getAge()); });
		 */

		// step 2:Create a method that prints all the elements in the list
		System.out.println("Print all Person:");
		performConditionally(people, p -> true,p->System.out.println(p));
		//Or Using Method Reference
		//performConditionally(people, p -> true,System.out::println);
		

		// step 3:Create a method that prints all people that have last name beginning
		// with B.
		System.out.println("\nLast Name Start with B:");
		performConditionally(people, p -> p.getLastName().startsWith("b"), p->System.out.println(p));

		System.out.println("\nFirst Name Start with C:");
		performConditionally(people, p -> p.getLastName().startsWith("c"), p->System.out.println(p.getFirstName()));
	}

	private static void performConditionally(List<Person> people, Predicate<Person> predicate,Consumer<Person> consumer) {
		for (Person p : people) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}

}
