package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entities.Product;

// parei na aula do predicate

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV ", 900.00));
		list.add(new Product("Notebook ", 1200.00));
		list.add(new Product("Table ", 450.00));

		list.forEach(System.out::println);

		

	}

}
