package n1exercici8;

public class Lambdas8{

	public static void main(String[] args) {
		
		String str1 = "odnuM aloH";
		Reverse reverse = str -> new StringBuilder(str).reverse().toString();
		System.out.println(reverse.reverse(str1));

	}


}
