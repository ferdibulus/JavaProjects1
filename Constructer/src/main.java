public class main {
	public static void main(String args[]) {
			//account account1 = new account();
			//System.out.println(account1.getIsim());
			//account account2 = new account("1111",1000.0,"ferdi bulus","5384540105","ferdi_bulus@hotmail.com");
			
			//account2.paraYatir(500);
			//account2.paraCekme(700);
			//account1.bilgileriGoster();
		
		account account1 = new  account("ferdi bulus","ferdi_bulus@hotmail.com","05384540105");
		account account2 = account1;
		System.out.println(account1.getIsim() + "\n" +account1.getBakiye());
		System.out.println(account2.getIsim() + "\n" +account2.getBakiye());
	}
}
