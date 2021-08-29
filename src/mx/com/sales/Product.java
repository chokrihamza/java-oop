package mx.com.sales;

public class Product {
   private int idProduct;
   private String name;
   private double price;
   private static int countProducts;
   
	public Product() {
		this.idProduct=++Product.countProducts;
	}
	
	public Product(String name,double price) {
		this();
		this.name=name;
		this.price=price;
		
	}
	
	public int getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [idProduct=");
		builder.append(idProduct);
		builder.append(", name=");
		builder.append(name);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}
	
	
}
