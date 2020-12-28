package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.0));
		list.add(new Product("HD Case", 80.0));

		//usando o metodo da classe product
		//list.forEach(Product::priceUpdate);
		
		//usando lambda
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

		//imprimir todas os itens da lista
		list.forEach(System.out::println);

	}
}
