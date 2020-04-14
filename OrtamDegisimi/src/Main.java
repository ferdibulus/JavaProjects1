
public class Main {
public static void main(String[] args) {
	System.out.println("Inheritance bad desing");
	ProductManager productManager = new ProductManager();
	productManager.add(new Product(1,"su", 2),1);
}
}
