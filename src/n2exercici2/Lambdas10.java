package n2exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Lambdas10 {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(4);
		array.add(13);
		array.add(2);
		array.add(76);
		array.add(195);
		System.out.println(intarrayToString(array));
		
	}
	public static String intarrayToString (List<Integer> list) {
		String str = (String) list.stream()
				.map(t -> {
					if (t % 2 == 0) {
						return "e" + t.toString();
					} else {
						return "o" + t.toString();
					}
					} )
				.collect(Collectors.joining(","));
		return str;
	}
	
}
