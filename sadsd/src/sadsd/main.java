
public class sadsd {
	interface BaseI { void method(); }

	class BaseC
	{
	   public void method()
	   {
	      System.out.println("Inside BaseC::method");
	   }
	}

	class ImplC extends BaseC implements BaseI
	{
	   public void main(String []s)
	   {
	      (new ImplC()).method();
	   }
	}

}
