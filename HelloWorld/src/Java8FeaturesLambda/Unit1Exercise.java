package Java8FeaturesLambda;

import java.util.List;
import java.util.Arrays;

public class Unit1Exercise {

	public static void main(String[] args) {
		List<Person> people= Arrays.asList(
				new Person("charles","Dickens",60),
				new Person("ramu","bhai",20),
				new Person("vishnu","bhai",66),
				new Person("surinder","bhai",40),
				new Person("mamesh","chingu",50)
				);
		//step 1:sort the list by name
		
		//step 2:Create a method that prints all the elements in the list
		
		//step 3:Create a method that prints all people that have last name beginning with C.
		
	}

}
interface MyList{
	void list();
}