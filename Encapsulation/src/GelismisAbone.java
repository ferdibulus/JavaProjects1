
public class GelismisAbone {
	
	private String isim;
	private int bakiye = 120;
	private String sehir ;
	
	public GelismisAbone(String isim,int bakiye,String sehir) {
		this.setIsim(isim);
		if(bakiye>0 && bakiye <=120) {
			this.bakiye = bakiye;
		}
		this.setSehir(sehir);
	}
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
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSehir() {
		return sehir;
	}
	public void setSehir(String sehir) {
		this.sehir = sehir;
	}
}
