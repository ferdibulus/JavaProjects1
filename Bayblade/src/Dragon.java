
public class Dragon extends Bayblade{
	private String kutsalCanavar;
	private String gizliYetenek;
	public Dragon(String baybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar,String gizliYetenek) {
		super(baybladeci, donusHizi, saldiriGucu);
		this.kutsalCanavar = kutsalCanavar;
		this.gizliYetenek = gizliYetenek;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void kutsalCanavarOrtayaCikar() {
		// TODO Auto-generated method stub
		System.out.println(getBaybladeci() + " " + kutsalCanavar + " i ortaya cikariyor..");
		System.out.println(getBaybladeci() + " in saldirisi : Hayalet Kasirgasi.");
	}
	@Override
	public void bilgileriGoster() {
		// TODO Auto-generated method stub
		super.bilgileriGoster();
		System.out.println("Kutsal Canavar Adi:" + kutsalCanavar);
		System.out.println("Gizli Yetenek:" + gizliYetenek);
	}


	

}
