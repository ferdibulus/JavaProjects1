
public class Dranza extends Bayblade{
	private String kutsalCanavar;
	
	public Dranza(String baybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar) {
		super(baybladeci, donusHizi, saldiriGucu);
		this.kutsalCanavar = kutsalCanavar;
	}

	@Override
	public void kutsalCanavarOrtayaCikar() {
		// TODO Auto-generated method stub
		System.out.println(getBaybladeci() + " " + kutsalCanavar + " i ortaya cikariyor..");
		System.out.println(getBaybladeci() + " in saldirisi : Alev kilici.");
	}

	@Override
	public void bilgileriGoster() {
		// TODO Auto-generated method stub
		super.bilgileriGoster();
		System.out.println("Kutsal Canavar Adi:" + kutsalCanavar);
	}


	
}
