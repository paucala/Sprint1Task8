package n2exercici3;

import java.util.ArrayList;
import java.util.function.Function;

public class Lambdas11 {

	public static void main(String[] args) {
		ArrayList<Float> nums = new ArrayList<Float>();
		float num1 = 83,  num2 = 2, num3 = 42;
		nums.add(num1);
		nums.add(num2);
		nums.add(num3);
		float r = 0;
		float r2 = 1;
		Operacio suma = (a) -> a.stream().reduce(r, (f1, f2) -> f1 + f2);
		Operacio resta = (a) -> a.stream().reduce(a.get(0) + a.get(0), (f1, f2) -> f1 - f2);
		Operacio multiplicacio = (a) -> a.stream().reduce(r2, (f1, f2) -> f1 * f2);
		Operacio divisio = (a) -> a.stream().reduce(a.get(0) * a.get(0), (f1, f2) -> f1 / f2);
		System.out.println(suma.operacio(nums));
		System.out.println(resta.operacio(nums));
		System.out.println(multiplicacio.operacio(nums));
		System.out.println(divisio.operacio(nums));

	}

}
