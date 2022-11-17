package n2exercici1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Lambdas9 {

	public static void main(String[] args) {
		List<String> array = List.of("Ana", "Laura", "Albert", "Ali", "Fernando");
		genericTester(array, a -> a.charAt(0) == 'A' && a.length() == 3);

	}
	public static <T> void genericTester(List<T> list, Predicate<T> tester) {
		ArrayList<T> newArray = new ArrayList<T>();
		for (T t : list) {
			if(tester.test(t)) {
				newArray.add(t);
			}
		}
		printList(newArray);
		
	}
	public static  <T> void printList(List<T> list) {
		for (T t : list) {
			System.out.println(t);
		}
		
	}

}
