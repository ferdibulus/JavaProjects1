
public class Abone {

	public String isim;
	public int bakiye;
	public String sehir;
	
	public void dogalgazKullan(int miktar) {
		if(this.bakiye - miktar <0) {
			System.out.println("Yeterli bakiye yok");
		}
		else {
			this.bakiye -= miktar;
			if(this.bakiye<=0) {
				System.out.println("Bakiyeniz bitmistir.Lutfen en yakin abone merkezine gidip kredi yukleyin"
						+ " Kredi Limiti = 120tl");
			}
			else {
				System.out.println("Yeni bakiye:" + bakiye);
			}
		}
	}
	
	public void bakiyeOgren() {
		System.out.println("Bakiye:" + bakiye);
	}

}
