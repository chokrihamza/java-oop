package mx.com.sales;

public class TestSales {
public static void main(String[] args) {
	Product product1=new Product("Swith",500);
	Product product2=new Product("RJ45",1500);
	Product product3=new Product("Router",2000);
	Order order1=new Order();
	order1.agregatProduct(product1);
	order1.agregatProduct(product2);
	order1.agregatProduct(product3);
	order1.showOrder();
	
}
}
