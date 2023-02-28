package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import util.PriceUpdate;
 

public class Program {
	


	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV ", 900.00));
		list.add(new Product("Notebook ", 1200.00));
		list.add(new Product("Tablet ", 450.00));
		list.add(new Product("HD CASE", 80.90));
			
		list.forEach( new PriceUpdate());
		
		list.forEach(System.out:: println);
	
	}

}
