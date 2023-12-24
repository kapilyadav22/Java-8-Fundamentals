package consumer;

import java.util.function.Consumer;

//consumerchaining
public class ConsumerChaining {

	public static void main(String[] args) {

		Consumer<String> c1 = s-> System.out.println(s+" is White");
		Consumer<String> c2 = s-> System.out.println(s+" have 4 legs");
		Consumer<String> c3 = s-> System.out.println(s+" eats grass");

//		c1.accept("Cow");
//		c2.accept("Cow");
//		c3.accept("Cow");

		c1.andThen(c2).andThen(c3).accept("Cow");
		//or

		Consumer<String> c4 = c1.andThen(c2).andThen(c3);
		c4.accept("Cow");
	}

}
