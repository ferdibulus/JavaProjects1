public class BaybladeFabrikasi {
	public Bayblade baybladeUret (String bayblade_turu) {
		
		if(bayblade_turu.equals("Dragon")) {
			return new Dragon("Takao", 800, 300, "Mavi Ejder", "Kutsal canavarla konusma");
		
		}
		else if(bayblade_turu.equals("Dranza")) {
			return new  Dranza("Kai", 600, 400, "Kirmizi Anka Kusu");
		}
		else if(bayblade_turu.equals("Drayga")) {
			return new  Drayga("Rei", 100, 350, "Beyaz Kaplan");
		}
		else if(bayblade_turu.equals("Draciel")) {
			return new Draciel("Max", 600, 400, "Kara Kaplunbag");
		}
		else {
			return  null;
		}
		
		
		
	}
}
