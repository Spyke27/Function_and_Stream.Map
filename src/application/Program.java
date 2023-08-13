package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCasaName;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 1899.90));
		list.add(new Product("Smartphone", 3259.90));
		list.add(new Product("Xbox-One", 1250.00));
		list.add(new Product("Notebook", 2999.90));
		list.add(new Product("Acer Nitro", 7280.90));
		
		List<String> names = list.stream().map(new UpperCasaName()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}

}
