
public class account {
	private String hesapNo;
	private double bakiye;
	private String isim;
	private String email;
	private String telefonNo;
	
	public account() {
//		this.hesapNo = "bilgi yok";
//		this.bakiye = 0.0;
//		this.isim ="bilgi yok";
//		this.telefonNo = "bilgi yok";
//		this.email= "bilgi yok";
		
		this("bilgi yok", 0, "bilgi yok", "bilgi yok", "bilgi yok");
		//System.out.println("kendi yazdigimiz constructer..");
	}
	public account(String hesapNo,double bakiye,String isim,String email,String telefonNo) {
		 this.hesapNo = hesapNo;
		 this.bakiye = bakiye;
		 this.isim = isim;
		 this.telefonNo = telefonNo;
		 this.email = email;
		 
		 
	}
	
	
	public account(String isim,String email,String telefonNo) {
		 this.isim = isim;
		 this.telefonNo = telefonNo;
		 this.email = email;
	}
	
	public void bilgileriGoster() {
		System.out.println("hesap no:" + this.hesapNo);
		System.out.println("bakiye :" + this.bakiye);
		System.out.println("isim:" + this.isim);
		System.out.println("telefon no:" + this.telefonNo);
		System.out.println("email:" + this.email);
	}
	
	public void paraYatir(double miktar) {
		bakiye += miktar;
		System.out.println("yeni bakiye = " + bakiye);
	}
	
	
	public void paraCekme(double miktar) {
		if(miktar>1500) {
			System.out.println("gunluk cekme limitin astiniz..");
		}
		if(bakiye-miktar<0) {
			System.out.println("yeterli bakiye yok" + bakiye);
		}
		else {
			bakiye -= miktar;
			System.out.println("yeni bakiye=" + bakiye);
		}
	}
	
	public String getHesapNo() {
		return hesapNo;
	}
	public void setHesapNo(String hesapNo) {
		this.hesapNo = hesapNo;
	}
	
	public double getBakiye() {
		return bakiye;
	}
	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefonNo() {
		return telefonNo;
	}
	public void setTelefonNo(String telefonNo) {
		this.telefonNo = telefonNo;
	}
	
}
