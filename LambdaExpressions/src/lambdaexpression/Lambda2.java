package lambdaexpression;


@FunctionalInterface
interface Cab2{
	public void bookCab();

	default public void city() {
		System.out.println("delhi");
	}
}



public class Lambda2 {
	public static void main(String[] args) {
		Cab2 cab = () -> System.out.println("Ola booked");
		cab.bookCab();
		cab.city();
	}
}
