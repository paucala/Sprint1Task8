package n1exercici4;

import java.util.ArrayList;

public class Lambdas4 {

	public static void main(String[] args) {
	 ArrayList<String> months = new ArrayList<String>();
	 months.add("Gener");
	 months.add("Febrer");
	 months.add("Març");
	 months.add("Abril");
	 months.add("Maig");
	 months.add("Juny");
	 months.add("Juliol");
	 months.add("Agost");
	 months.add("Setembre");
	 months.add("Octubre");
	 months.add("Novembre");
	 months.add("Desembre");
	 
	 months.forEach(System.out::println);
	 
	}

}
