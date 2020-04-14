
public class ProductManager {
	
	public  void add(Product product,int databaseType) {
		
		if(databaseType == 1) {
			MySqlProductDao mysqlProductDao = new MySqlProductDao("Mysql String");
			mysqlProductDao.add(product);
			
		}
		else if(databaseType == 2) {
			OracleProductDao oracleProductDao = new OracleProductDao("Oracle String");
			oracleProductDao.add(product);
			
		}
		System.out.println("Urun is katmani islemleri");
		System.out.println("Urun ismi: " + product.getName());
		
	}
}
