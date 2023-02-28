package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Product;
import util.UperCaseName;
 

public class Program {
	


	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV ", 900.00));
		list.add(new Product("Notebook ", 1200.00));
		list.add(new Product("Tablet ", 450.00));
		list.add(new Product("HD CASE", 80.90));

	List<String> names =  list.stream().map(new UperCaseName()).collect(Collectors.toList());
	
	names.forEach(System.out:: println);
	
	}

}
