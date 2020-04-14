//sup-class yani bir alt siniftir.
public class Yonetici extends Calisan {
	private int sorumlu_kisi ;
	public Yonetici(String name, int salary, String department,int sorumlu_kisi) {
//		this.name = name;
//		this.salary = salary;
//		this.department = department;
		
	super(name,salary,department);
	this.sorumlu_kisi = sorumlu_kisi;
}
	public void bilgileriGoster(){
//		System.out.println("Isim:" + getName());
//		System.out.println("Maas:" + getSalary());
//		System.out.println("Department:" + getDepartment());
//		System.out.println("Sorumlu Kisi: " + sorumlu_kisi);
		super.bilgileriGoster();
		System.out.println("Sorumlu Kisi: " + this.sorumlu_kisi);
		
	}
	
	public void zamYap(int zam_miktari) {
		System.out.println("Calisanlara " + zam_miktari + " tl zam yapildi");
	}
}