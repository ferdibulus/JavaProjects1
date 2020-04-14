package oopGiris;

public class Main {
	public static void main(String args[]) {
		Araba araba1 = new Araba() ;
			
		araba1.setModel("Mercedes");
		System.out.println("Arabanin Modeli = " + araba1.getModel());
	    
		araba1.setKapilar(-4);
		System.out.println("Kapilar:" + araba1.getKapilar());
		
	}
}
