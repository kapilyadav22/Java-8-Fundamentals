package lambdaexpression;


@FunctionalInterface
interface Cab3{

	public void bookCab(String Source, String Destination);
	default public void city() {
		System.out.println("delhi");
	}
}

public class lambda3 {
	public static void main(String[] args) {
		Cab3 cab =(Source,Destination) -> System.out.println("cab is booked from "+ Source +" to "+Destination);
		cab.bookCab("Delhi", "Rajasthan");
		cab.city();
	}
}

