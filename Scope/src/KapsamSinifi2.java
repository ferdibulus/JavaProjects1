
public class KapsamSinifi2 {
    private int privateDegisken = 30;
    
    public KapsamSinifi2() {
    	
    }
    
    public class DahiliSinif{
    	   private int privateDegisken = 20;
    	public void onIleCarp() {
    	 for(int i=1; i<6; i++) {
			 System.out.println(i + "*" + privateDegisken + " =" + (i*privateDegisken));
		 }
    	}	 
    }
}
