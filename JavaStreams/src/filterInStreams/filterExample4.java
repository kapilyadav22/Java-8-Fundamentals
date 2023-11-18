package filterInStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int id;
	String name;
	double price;

	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
public class filterExample4 {

	public static void main(String[] args) {

		List<Product> productsList = new ArrayList<>();
		productsList.add(new Product(1, "Table",5000));
		productsList.add(new Product(2, "Chair",65000));
		productsList.add(new Product(3, "Bag",67800));
		productsList.add(new Product(4, "Keyboard",10920));
		productsList.add(new Product(5, "Mouse",400));

		//store the products whose price> 5000,
		List<Product> newProductsList = new ArrayList<>();
		newProductsList = productsList.stream().filter(p->p.price>5000).collect(Collectors.toList());

		for(Product product : newProductsList) {
			System.out.println(product.name + " " + product.price);
		}
		//without storing, just printing the products
		productsList.stream().filter(p->p.price>5000).forEach(product-> System.out.println(product.name));

	}
}

