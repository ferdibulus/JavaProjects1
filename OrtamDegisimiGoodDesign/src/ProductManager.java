
public class ProductManager {
	private BaseProductDao baseProductDao;
	
	public ProductManager(BaseProductDao baseProductDao) {
		
		this.baseProductDao = baseProductDao;
	}

	public  void add(Product product,int databaseType) {
	
		System.out.println("Urun is katmani islemleri");
		System.out.println("Urun ismi: " + product.getName());
		
	}
}
