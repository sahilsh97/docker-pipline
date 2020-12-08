package Java8FeaturesLambda;
//Using Lambda with interface.
public class TypeInferenceExample {

	public static void main(String[] args) {

		// StringLengthLambda mylambda=(String s)->s.length(); OR
		StringLengthLambda mylambda = s -> s.length(); 
		
		System.out.println("Length of String:" + mylambda.getLength("sahil"));
		
		//OR instead of above logic we can also do like this->
		
		printLambda(s -> s.length());
	}

	public static void printLambda(StringLengthLambda a) {
		System.out.println(a.getLength("Hello Lambda"));
	}
	
	interface StringLengthLambda {
		int getLength(String a);
	}
}
