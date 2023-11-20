package lambdaexpression;


@FunctionalInterface
interface Cab4{
	public String bookCab(String Source, String Destination);
}

//class Ola implements Cab4{
//	public String bookCab(String Source, String Destination) {
//		System.out.println("cab is booked from "+ Source +" to "+Destination);
//		return ("Price : Rs 3000");
//	}
//}
public class lambda4 {
	public static void main(String[] args) {
		//Cab4 cab = new Ola();
		Cab4 cab =(Source,Destination) ->
		{ System.out.println("cab is booked from "+ Source +" to "+Destination);
			return ("Price : Rs 3000");
		};

		String Price = cab.bookCab("Delhi", "Rajasthan");
		System.out.println(Price);

	}
}

