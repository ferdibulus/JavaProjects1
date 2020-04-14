
public class Main {
public static void main (String args[]) {
//	Abone abone = new Abone();
//	abone.isim = "FERDI";
//	abone.bakiye = 200;
//	abone.sehir = "Istanbul";
//	
//	abone.dogalgazKullan(200);
	
	GelismisAbone gabone = new GelismisAbone("ferdi",200, "Ankara");
	gabone.bakiyeOgren();
	gabone.dogalgazKullan(50);
}
}
