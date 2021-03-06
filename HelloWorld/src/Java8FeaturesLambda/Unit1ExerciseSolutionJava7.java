package Java8FeaturesLambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("charles", "Dickens", 60), new Person("ramu", "balu", 20),
				new Person("vishnu", "bhai", 66), new Person("gobind", "bhadwa", 40),
				new Person("mamesh", "chingu", 50));

		// step 1:sort the list by lastname
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareToIgnoreCase(o2.getLastName());
			}
		});

		/*
		 * //sort by age Collections.sort(people, (a, b) -> { return
		 * Integer.compare(a.getAge(), b.getAge()); });
		 */

		// step 2:Create a method that prints all the elements in the list
		System.out.println("Print all Person:");
		printAll(people);

		// step 3:Create a method that prints all people that have last name beginning
		// with B.
		System.out.println("\nLast Name Start with B:");
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person prs) {
				return prs.getLastName().startsWith("b");
			}
		});
		
		System.out.println("\nFirst Name Start with C:");
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person prs) {
				return prs.getFirstName().startsWith("c");
			}
		});
	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person p : people) {
			if (condition.test(p)) {
				System.out.println(p);
			}
		}
	}

	private static void printAll(List<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}
	}

}

interface Condition {
	boolean test(Person prs);
}
