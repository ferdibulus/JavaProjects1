
public class OracleProductDao extends BaseProductDao {

	public OracleProductDao(String connectionString) {
		super(connectionString);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Product product) {
		System.out.println("Oracle Database :" + product.getName() + "ekledi.");
	}
	

}
