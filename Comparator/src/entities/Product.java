package entities;

public class Product  {
	
	
	private String name;
	private double price;
	
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return price;
	}

	public void setValue(double value) {
		this.price = value;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", value=" + price + "]";
	}
	

	
	
	

}
