package dsa;
public class ss {
	
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
	   public void main(String args[])
	   {
	      (new ImplC()).method();
	      System.out.println("girdi");
	   }
	}
}
