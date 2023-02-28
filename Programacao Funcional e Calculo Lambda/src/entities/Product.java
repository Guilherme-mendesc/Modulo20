package entities;

public class Product {

	
	public String name;
	public int price;
	
	public Product(String name, double d) {
		super();
		this.name = name;
		this.price = (int) d;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = (int) price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", value=" + price + "]";
	}

	

	
	
	


}
