package JavaBasics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import Java8FeaturesLambda.Person;

//Iteration using ForEach & Stream.
public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> people= Arrays.asList(
				new Person("charles","Dickens",60),
				new Person("ramu","bhai",20),
				new Person("vishnu","bhai",66),
				new Person("surinder","bhai",40),
				new Person("mamesh","chingu",50)
				);

		//For In Loop
		System.out.println("Iteration using for In loop:");
		for (Person p:people) {
			System.out.println(p);
		}
		
		//For Each Loop //It uses Consumer Interface
		System.out.println("Iteration using for Each loop:");
		//people.forEach(p->System.out.println(p));
		people.forEach(System.out::println);
		
		System.out.println("Iteration using Stream:");
		List<Person> people2 = null;

		//Fetching one List from another based on some condition
		people2=people.stream().filter(p->p.getLastName().startsWith("b")&&p.getAge()>=40).collect(Collectors.toList());
		//In the above statement the collect method collects all elements for which filter returns true and transforms them into a list.
		people2.forEach(System.out::println);
		
		//For simply Printing It
		//people.stream().filter(p->p.getLastName().startsWith("b")).forEach(p->System.out.println(p));
	}

}
