import java.util.Scanner;

public class Main {
public static void main(String args[]) {
	System.out.println("Bayblade Programina Hosgeldiniz..");
	System.out.println("Cikis icin q'ya basiniz.");
	
	Scanner scanner = new Scanner(System.in);
	while(true) {
		System.out.println("Hangi baybladei uretmek istiyorsunuz?");
		String islem = scanner.nextLine();
		if(islem.equals("q")) {
			System.out.println("Programdan cikiliyor.");
			break;
		}
		else {
			
			BaybladeFabrikasi fabrika = new BaybladeFabrikasi();
			Bayblade bayblade = fabrika.baybladeUret(islem);
			if(bayblade == null) {
				System.out.println("Lutfen gecerli bir baybalde ismi giriniz.");
			}
			else {
				bayblade.bilgileriGoster();
				bayblade.saldir();
				bayblade.kutsalCanavarOrtayaCikar();
				
			}
		}
	}
}
}
