package n1exercici5;

public class Lambda5 {

	public static void main(String[] args){
		GetPiValueInterface getPiValue = () -> 3.1415;;
		System.out.println(getPiValue.getPiValue());

	}

}
