
public class Bayblade {

		private String baybladeci;
		private int donusHizi;
		private int saldiriGucu;
		public Bayblade(String baybladeci, int donusHizi, int saldiriGucu) {
			this.setBaybladeci(baybladeci);
			this.setDonusHizi(donusHizi);
			this.setSaldiriGucu(saldiriGucu);
		}
		public String getBaybladeci() {
			return baybladeci;
		}
		public void setBaybladeci(String baybladeci) {
			this.baybladeci = baybladeci;
		}
		public int getDonusHizi() {
			return donusHizi;
		}
		public void setDonusHizi(int donusHizi) {
			this.donusHizi = donusHizi;
		}
		public int getSaldiriGucu() {
			return saldiriGucu;
		}
		public void setSaldiriGucu(int saldiriGucu) {
			this.saldiriGucu = saldiriGucu;
		}
		
		public void saldir() {
			System.out.println(baybladeci + " " + saldiriGucu + " ve " + donusHizi + " ile saldiriyor." );
			
		}
		
		public void kutsalCanavarOrtayaCikar() {
			System.out.println("Bayblade'in kutsal canavari bulunmuyor..");
		}
		public void bilgileriGoster() {
			System.out.println("Baybladeci ismi: " + baybladeci);
			System.out.println("Donus hizi : " + donusHizi);
			System.out.println("Saldiri guvucu: " + saldiriGucu);
			
		}
		public int saldiriGucuArttirma(int saldiriGucuArttirma) {
			
			return saldiriGucuArttirma;
		}
		
		
}
