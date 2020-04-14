public class Main {
public static void main(String[] args) {
	BaseProductDao baseProductDao = new OracleProductDao("Oracle String");
	baseProductDao.add(new Product(1, "su" , 2));
}
}
