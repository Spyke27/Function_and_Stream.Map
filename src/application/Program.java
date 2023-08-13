package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 1899.90));
		list.add(new Product("Smartphone", 3259.90));
		list.add(new Product("Xbox-One", 1250.00));
		list.add(new Product("Notebook", 2999.90));
		list.add(new Product("Acer Nitro", 7280.90));

	}

}
