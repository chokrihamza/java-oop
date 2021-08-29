package mx.com.sales;



public class Order {
	private int idOrder;
	private Product products[];
	private static int countOrder;
	private int countProducts;
	private static final int MAX_PRODUCTS=10;

	public Order() {
		this.idOrder=++Order.countOrder;
		this.products=new Product[Order.MAX_PRODUCTS];

	}

	public void agregatProduct(Product product) {
		if(this.countProducts<Order.MAX_PRODUCTS) {
			this.products[countProducts++]=product;

		}else {
			System.out.println("you pass the limit of products"+Order.MAX_PRODUCTS);
		}

	}

	public double calculateTotal() {
		double total=0;
		for (int i = 0; i <this.countProducts; i++) {
			//Product product=this.products[0];
			total+=this.products[i].getPrice();

		}
		return total;
	}
	
	public void showOrder() {
		System.out.println("id Order"+this.idOrder);
		double totalOrder=this.calculateTotal();
		System.out.println("The total is: "+totalOrder+"$");
		System.out.println("The list of products :");
		for (int i = 0; i < this.countProducts; i++) {
			System.out.println(this.products[i]);
		}
	}
	
}
